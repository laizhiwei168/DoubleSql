package com.cimc.senheyun.service;

import com.cimc.senheyun.po.DataPo;
import com.cimc.senheyun.po.TaEquipmentPo;
import com.cimc.senheyun.utils.dao.DataSource;
import com.cimc.senheyun.vo.DataVo;
import com.cimc.senheyun.vo.PageOutVo;
import com.cimc.senheyun.vo.TaEquipmentVo;

@DataSource(value="dateSource_second")
public interface DataService {
	public PageOutVo<DataPo> selectByExample(DataVo vo);
    
}
