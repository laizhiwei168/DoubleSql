package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.ProductCategory;
import com.cimc.senheyun.po.ProductCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryMapper {
    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    int updateByExampleSelective(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    int updateByExample(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);
}