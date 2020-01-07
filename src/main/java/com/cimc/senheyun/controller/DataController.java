package com.cimc.senheyun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cimc.senheyun.exception.MyStatus;
import com.cimc.senheyun.exception.ParameterException;
import com.cimc.senheyun.po.DataPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.DataService;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.utils.DateUtils;
import com.cimc.senheyun.utils.ErrorMsg;
import com.cimc.senheyun.vo.DataVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;


@Component
@RequestMapping("/Data")
public class DataController {
	private Logger logger = LogManager.getLogger(DataController.class.getName());
	@Resource(name="dataService")
	private DataService service;
	
	@Resource(name="taEquipmentService")
	private TaEquipmentService service1;
	
	/**
	 * 查询历史数据表
	 * 历史数据表是一个月为一张
	 * 方法是按时间查询
	 * 调用一个时间按月的方法，获取多少张月表
	 * 然后在dao中利用union all 拼接多张数据表
	 * 
	 * */
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(@RequestBody DataVo vo) {
		if (vo.getStartTime() == null || vo.getEndTime() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		List<String> datas=DateUtils.getmon(vo.getStartTime(), vo.getEndTime());
		
		vo.setDatas(datas);
		PageOutVo<DataPo> list=service.selectByExample(vo);
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
	/***
	 * 在一个controller层调用多个数据源，因为数据源配置在service层
	 * @param vo
	 * @return
	 */
	@RequestMapping(value = "/selectDouble", method = RequestMethod.POST)
	public @ResponseBody Object selectDouble(@RequestBody DataVo vo) {
		if (vo.getStartTime() == null || vo.getEndTime() == null){
			logger.error(ErrorMsg.getMsg("ParaError001"));
			throw new ParameterException(ErrorMsg.getMsg("ParaError001"));
		}
		
		PageOutVo<TaEquipmentPo> list1=service1.selectByExample(new TaEquipmentVo());
		
		List<String> datas=DateUtils.getmon(vo.getStartTime(), vo.getEndTime());
		vo.setDatas(datas);
		PageOutVo<DataPo> list=service.selectByExample(vo);
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		obj.put("content1", list1);
		return obj;
	}
	
}
