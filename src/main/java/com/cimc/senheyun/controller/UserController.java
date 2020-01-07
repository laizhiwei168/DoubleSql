package com.cimc.senheyun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.service.UserService;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.utils.Jedis;
import com.cimc.senheyun.utils.MD5Util;
import com.cimc.senheyun.utils.jo.FormToken;
import com.cimc.senheyun.vo.BsUserVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.google.common.collect.Maps;
import com.google.gson.Gson;

@Component
@RequestMapping("/User")
public class UserController { 
	private Logger logger = LogManager.getLogger(TaEquipmentController.class.getName());

	@Resource(name="userService")
	private UserService service;
	 
	/***
	 * 
	 * 用户登录获取token码
	 * 测试token提交
	 * 
	 * 
	 */
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public @ResponseBody Object Login(@RequestBody BsUserVo vo,HttpSession httpsession,HttpServletRequest request,HttpServletResponse response) {
		if (vo.getName() == null || vo.getPassword() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		
		List<BsUserPo> lsit=service.login(vo);
		BsUserPo user1=null;
		if(lsit!=null && !lsit.isEmpty()) {
			user1=lsit.get(0);		
			if(user1!=null){
				if(user1.getPassword().equals(MD5Util.stringMD5(vo.getPassword()))) {
					Gson gson = new Gson();//创建gson对象
					String key = UUID.randomUUID().toString();
					Jedis.set("SESSION:"+key, gson.toJson(user1));				
					user1.setToken(key);
					Map<String, Object> obj = new HashMap<String, Object>();
					obj.put("status", new MyStatus("00", "00", "Success"));
					obj.put("content", user1);
					return obj;
				}
			}
		}
		
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("01", "01", "defeat"));
		return obj;
	}
	
	/**
	 * 处理重复提交问题
	 * 
	 * @param po
	 * @param request
	 * @return
	 */
	@FormToken(save=true)// 开启重复提交注解 ， 并获取formtoken
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody Object insert(@RequestBody BsUserPo po,HttpServletRequest request) {	
		System.out.println("----------User----insert-------------");
		
		String serverToken = (String) request.getSession().getAttribute("formToken");
		System.out.println("--------"+po.getName()+"   "+serverToken);
		
		int i=service.insert(po);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
	
	@FormToken(remove=true) // 根据formtoken判断是否为重复提交，匹配正确后移除
	@RequestMapping(value = "/insert1", method = RequestMethod.POST)
	public @ResponseBody Object insert1(@RequestBody BsUserPo po) {	
		System.out.println("----------User----insert1-------------");
		System.out.println("--------"+po.getName());
		int i=service.insert(po);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
	
	
	@RequestMapping(value = "/insert2", method = RequestMethod.POST)
	public @ResponseBody Object insert2(@RequestBody BsUserPo po) {	
		System.out.println("----------User----insert2-------------");
		System.out.println("--------"+po.getName());
		int i=service.insert(po);
		Map<String, Object> obj = Maps.newHashMap();
		if(i>0) {
			obj.put("status", new MyStatus("00", "00", "Success"));
		}else {
			obj.put("status", new MyStatus("01", "01", "defeat"));
		}
		return obj;
	}
	
		
}
