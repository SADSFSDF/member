package com.qf.service.impl;

import com.qf.domain.dto.MemberDto;
import com.qf.domain.entity.Member;
import com.qf.domain.entity.Memberlevel;
import com.qf.domain.entity.User;
import com.qf.mapper.MemberLevelMapper;
import com.qf.mapper.MemberMapper;
import com.qf.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.qf.Exception.ServiceException;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.ServerException;
import java.util.LinkedList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberLevelMapper memberLevelMapper;

    @Resource
    MemberMapper memberMapper;

    @Override
    @Transactional
    public int addMember(MemberDto memberDto) throws ServiceException {
        int count = 0;
        Member member = new Member();
        Memberlevel memberlevel =new Memberlevel();
        BeanUtils.copyProperties(memberDto.getMember(),member);
        memberMapper.insertSelective(member);
        if(member.getMemberId()!=null){
            BeanUtils.copyProperties(memberDto.getMemberlevel(),memberlevel);
            memberlevel.setMemberId(member.getMemberId());
            count = memberLevelMapper.insertSelective(memberlevel);
        }
        return count;
    }

    @Override
    public List<MemberDto> getAllMembers() throws ServerException {
        List<MemberDto> memberDtos = null;
        memberDtos = memberMapper.selectAllMemberAndLevel();
        return memberDtos;
    }

    @Override
    public int delMember(List list) throws ServerException {
        int count = 0;
        count = memberMapper.deleteById(list);
        return count;
    }

    @Override
    public int addBanthMember(List<MemberDto> memberDtoList) throws ServerException {
        List<Member> list = new LinkedList();
        for (MemberDto memberDto : memberDtoList) {
            list.add(memberDto.getMember());
        }
        System.out.println(list);
        memberMapper.insertBatchByPrimaryKey(list);
        for (Member member : list) {
//            Integer memberId = member.getMemberId();
//            System.out.println(memberId);
            System.out.println(member);
        }
        return 0;
    }

    @Override
    public int addMember2(User user) throws ServerException {
        memberMapper.insert2(user)
        return 0;
    }

}
