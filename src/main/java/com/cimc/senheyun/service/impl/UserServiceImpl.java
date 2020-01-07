package com.cimc.senheyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cimc.senheyun.dao.BsUserDao;
import com.cimc.senheyun.dao.TaEquipmentDao;
import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.service.UserService;
import com.cimc.senheyun.vo.BsUserVo;
import com.cimc.senheyun.vo.PageOutVo;

@Transactional
@Component("userService")
public class UserServiceImpl implements UserService{

	@Resource(name="bsUserDao")
	private BsUserDao dao;
	
	@Override
	public List<BsUserPo> login(BsUserVo vo) {
		List<BsUserPo> list=dao.selectByExample(vo);
		return list;
	}
	
	@Override
	public PageOutVo<BsUserPo> selectByExample(BsUserVo vo) {
		System.out.println("=======UserService=====selectByExample=====");
		List<BsUserPo> list=dao.selectByExample(vo);
		int total= dao.findByCount(vo);
		PageOutVo<BsUserPo> page = new PageOutVo<BsUserPo>();
		page.setRows(list);
		page.setFirstIndex(vo.getFirstIndex());
		page.setPageSize(vo.getPageSize());
		page.setTotalRecord(total);
		return page;
	}

	@Override
	public int insert(BsUserPo po) {
		System.out.println("=======UserService=====insert=====");
		return 0;
	}

	@Override
	public int update(BsUserPo po) {
		return 0;
	}

	

}
