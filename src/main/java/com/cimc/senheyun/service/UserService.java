package com.cimc.senheyun.service;

import java.util.List;

import com.cimc.senheyun.po.BsUserPo;
import com.cimc.senheyun.utils.dao.DataSource;
import com.cimc.senheyun.vo.BsUserVo;
import com.cimc.senheyun.vo.PageOutVo;

@DataSource(value="dataSource_first")
public interface UserService {

	public List<BsUserPo> login(BsUserVo vo);
	
	public PageOutVo<BsUserPo> selectByExample(BsUserVo vo);
	  
    int insert(BsUserPo po);

    int update( BsUserPo po);
	
}
