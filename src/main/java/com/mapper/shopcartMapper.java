package com.mapper;

import com.domain.shopcart;

public interface shopcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopcart record);

    int insertSelective(shopcart record);

    shopcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopcart record);

    int updateByPrimaryKey(shopcart record);
}