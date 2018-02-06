package com.mapper;

import com.domain.address;

public interface addressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(address record);

    int insertSelective(address record);

    address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(address record);

    int updateByPrimaryKey(address record);
}