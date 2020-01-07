package com.cimc.senheyun.controller;

import java.util.HashMap;
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
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;


@Component
@RequestMapping("/TaEquipment")
public class TaEquipmentController {
	private Logger logger = LogManager.getLogger(TaEquipmentController.class.getName());
	@Resource(name="taEquipmentService")
	private TaEquipmentService service;
		
	// 查询资料信息
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public @ResponseBody Object selectByExample(@RequestBody TaEquipmentVo vo) {
		PageOutVo<TaEquipmentPo> list=service.selectByExample(vo);
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("status", new MyStatus("00", "00", "Success"));
		obj.put("content", list);
		return obj;
	}
	
}
