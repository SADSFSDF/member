package com.qf.mapper;

import com.qf.domain.entity.Memberlevel;

public interface MemberLevelMapper {
    int deleteByPrimaryKey(Integer levelId);

    int insert(Memberlevel record);

    int insertSelective(Memberlevel record);

    Memberlevel selectByPrimaryKey(Integer levelId);

    int updateByPrimaryKeySelective(Memberlevel record);

    int updateByPrimaryKey(Memberlevel record);
}