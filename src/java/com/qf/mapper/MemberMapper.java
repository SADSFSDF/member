package com.qf.mapper;

import com.qf.domain.dto.MemberDto;
import com.qf.domain.entity.Member;
import com.qf.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<MemberDto> selectAllMemberAndLevel();

    int deleteById(@Param("ids") List<Integer> ids);

    int insertBatchByPrimaryKey(List<Member> memberList);


    int insert2(User user);
}