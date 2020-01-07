package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.po.DataPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.DataService;
import com.cimc.senheyun.service.TaEquipmentService;
import com.cimc.senheyun.vo.DataVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;
import com.cimc.senheyun.dao.DataDao;
import com.cimc.senheyun.dao.TaEquipmentDao;

@Transactional
@Component("dataService")
public class DataServiceImpl  implements  DataService{

	@Resource(name="dataDao")
	private DataDao Dao;
	
	
	@Override
	public PageOutVo<DataPo> selectByExample(DataVo vo) {
		
		List<DataPo> list=Dao.selectByExample(vo);
		int total=1;
		PageOutVo<DataPo> page = new PageOutVo<DataPo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}
}
