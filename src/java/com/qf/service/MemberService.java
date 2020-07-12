package com.qf.service;

import com.qf.domain.dto.MemberDto;
import com.qf.domain.entity.User;

import java.rmi.ServerException;
import java.util.List;

public interface MemberService {
    int addMember(MemberDto memberDto) throws ServerException;

    List<MemberDto> getAllMembers() throws ServerException;

    int delMember(List list) throws ServerException;

    int addBanthMember(List<MemberDto> memberDtoList) throws ServerException;

    int addMember2(User user) throws ServerException;
}
