package com.mapper;

import com.domain.parentOrder;

public interface parentOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(parentOrder record);

    int insertSelective(parentOrder record);

    parentOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(parentOrder record);

    int updateByPrimaryKey(parentOrder record);
}