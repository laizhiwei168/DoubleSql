package com.cimc.senheyun.interceptor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.utils.Jedis;
import com.cimc.senheyun.utils.jo.FormToken;
import com.google.gson.Gson;

public class Interceptors  implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		//System.out.println("=======拦截器=========");
		String token= req.getHeader("token");
		String result = Jedis.get("SESSION:"+token);
		if(result==null){
			return false;
		}else{
			//不等于空说明已登录，通过
			//因为是免登陆效果当退出的时候session已经被清空，需要在这里重新把对象存到session
			Gson gson = new Gson();
			BsUserPo user = gson.fromJson(result, BsUserPo.class);
			
			
			/*处理重复提交  start*/
			if (arg2 instanceof HandlerMethod) {
	            HandlerMethod handlerMethod = (HandlerMethod) arg2;
	            Method method = handlerMethod.getMethod();
	            FormToken annotation = method.getAnnotation(FormToken.class);
	            if (annotation != null) {
	                boolean needSaveSession = annotation.save();
	                if (needSaveSession) {
	                	String formToken=UUID.randomUUID().toString();
	                	req.getSession().setAttribute("formToken", formToken);
	                	System.out.println("formToken:"+formToken);
	                }
	                boolean needRemoveSession = annotation.remove();
	                if (needRemoveSession) {
	                    if (isRepeatSubmit(req)) {
	                        return false;
	                    }
	                    req.getSession().removeAttribute("formToken");
	                }
	            }
	            //System.out.println("=====annotation is null======");
	            return true;
	        } else {
	        	//System.out.println("======回调=====");
	            return preHandle(req, resp, arg2);
	        }
			/*处理重复提交  end*/
		}
    }

    private boolean isRepeatSubmit(HttpServletRequest request) {
        String serverToken = (String) request.getSession().getAttribute("formToken");
        if (serverToken == null) {
            return true;
        }
        String clinetToken = request.getParameter("formToken");
        if (clinetToken == null) {
            return true;
        }
        if (!serverToken.equals(clinetToken)) {
            return true;
        }
        return false;
    }
	
	/**
	 * 接口token认证
	 */
	private void token() {
		System.out.println("=======拦截器=========");
		//System.out.println(req.getHeader("token"));
/*=======================================================*/
		//根据cookie来判断是否登录
		//得到所有的cookie
		/*Cookie[] cookies = req.getCookies();
		for(Cookie cookie : cookies){
			System.out.println("=======f=======");
			//查看cookie中有没有叫token的授权码key，指向的是redis中登录时存的user对象
			if(cookie.getName().equals("token")){
				//如果有取出token中的key授权码value去核对
				String token = cookie.getValue();
				System.out.println("token:"+token);
				//在redis中看该授权码对应的信息是否正确
				String result = Jedis.get("SESSION:"+token);
				if(result==null){
					//如果在redis中没有对应的信息跳转到登录页面
					//resp.sendRedirect("/login.jsp");
					System.out.println("======Jedis===token=====");
					return false;
				}else{
					//不等于空说明已登录，通过
					//因为是免登陆效果当退出的时候session已经被清空，需要在这里重新把对象存到session
					Gson gson = new Gson();
					BsUserPo user = gson.fromJson(result, BsUserPo.class);
					req.getSession().setAttribute("user", user);
					return true;
				}
			}
		}*/
		System.out.println("======end=======");
		//return true;
	}

}
