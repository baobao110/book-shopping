package com.mapper;

import com.domain.city;

public interface cityMapper {
    int insert(city record);

    int insertSelective(city record);
}