package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.OrderMaster;
import com.cimc.senheyun.po.OrderMasterExample;
import org.apache.ibatis.annotations.Param;

public interface OrderMasterMapper {
    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    int updateByExampleSelective(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);

    int updateByExample(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);
}