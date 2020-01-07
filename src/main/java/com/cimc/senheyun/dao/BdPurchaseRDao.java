package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.BdPurchaseRPo;
import com.cimc.senheyun.po.RlOrgRolePo;
import com.cimc.senheyun.vo.BdPurchaseRVo;
import java.util.List;

public interface BdPurchaseRDao {
	
	int findByCount(BdPurchaseRVo vo);
    
    List<RlOrgRolePo> selectByExample(BdPurchaseRVo vo);
    
    int insert(BdPurchaseRPo po);

    int update(BdPurchaseRPo po);    
	
}