package com.cimc.senheyun.dao;

import java.util.List;

import com.cimc.senheyun.po.TaLandPo;
import com.cimc.senheyun.vo.TaLandVo;

public interface TaLandDao {
	int findByCount(TaLandVo vo);
    
    List<TaLandPo> selectByExample(TaLandVo vo);
    
    int insert(TaLandPo po);

    int update( TaLandPo po);
}