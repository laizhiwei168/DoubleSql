package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.BdPurchaseRDExample;
import com.cimc.senheyun.po.BdPurchaseRDPo;
import com.cimc.senheyun.po.BdPurchaseRPo;
import com.cimc.senheyun.po.RlOrgRolePo;
import com.cimc.senheyun.vo.BdPurchaseRVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BdPurchaseRDDao {
	/*int findByCount(BdPurchaseRDVo vo);
    
    List<BdPurchaseRDPo> selectByExample(BdPurchaseRDVo vo);*/
    
    int insert(BdPurchaseRDPo po);

    int update(BdPurchaseRDPo po);   
   /* int insert(BdPurchaseRDPo record);

    int insertSelective(BdPurchaseRDPo record);

    int updateByExampleSelective(@Param("record") BdPurchaseRD record, @Param("example") BdPurchaseRDExample example);

    int updateByExample(@Param("record") BdPurchaseRD record, @Param("example") BdPurchaseRDExample example);*/
}