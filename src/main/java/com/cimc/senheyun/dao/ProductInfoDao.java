package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.ProductInfoPo;
import com.cimc.senheyun.vo.ProductInfoVo;

import java.util.List;


public interface ProductInfoDao {
	int findByCount(ProductInfoVo vo);
    
    List<ProductInfoPo> selectByExample(ProductInfoVo vo);
    
    int insert(ProductInfoPo po);

    int update(ProductInfoPo po);
}