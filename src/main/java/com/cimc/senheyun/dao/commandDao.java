package com.cimc.senheyun.dao;

import com.cimc.senheyun.po.commandPo;

public interface commandDao {
    int insert(commandPo record);
    int update(commandPo record);
}