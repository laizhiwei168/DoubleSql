package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.OrderDetail;
import com.cimc.senheyun.po.OrderDetailExample;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);
}