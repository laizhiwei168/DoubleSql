package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.po.DataPo;
import com.cimc.senheyun.utils.dao.DataSource;
import com.cimc.senheyun.vo.DataVo;

public interface DataDao {
	List<DataPo> selectByExample(DataVo vo);
}
