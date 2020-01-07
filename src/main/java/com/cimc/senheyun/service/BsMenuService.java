package com.cimc.senheyun.service;

import java.util.List;

import com.cimc.senheyun.po.BsMenuPo;
import com.cimc.senheyun.utils.dao.DataSource;

@DataSource(value="dataSource_first")
public interface BsMenuService {

	public List<BsMenuPo> findAllRecursion();
}
