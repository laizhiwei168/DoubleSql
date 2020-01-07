package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.SellerInfo;
import com.cimc.senheyun.po.SellerInfoExample;
import org.apache.ibatis.annotations.Param;

public interface SellerInfoMapper {
    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    int updateByExampleSelective(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByExample(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);
}