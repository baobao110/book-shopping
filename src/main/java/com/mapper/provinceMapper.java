package com.mapper;

import com.domain.province;

public interface provinceMapper {
    int insert(province record);

    int insertSelective(province record);
}