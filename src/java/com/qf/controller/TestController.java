package com.qf.controller;


import com.qf.domain.dto.MemberDto;
import com.qf.domain.entity.Member;
import com.qf.domain.entity.Memberlevel;
import com.qf.domain.entity.User;
import com.qf.service.MemberService;
import com.qf.utils.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/member")
public class TestController {

    @Resource
    MemberService memberService;

    @RequestMapping("/add")
    @ResponseBody
    public ResponseEntity test() throws ServerException {
        MemberDto memberDto = new MemberDto();
        Member member = new Member();
        member.setMemberName("毛子鹏");
        member.setMemberGender("男");
        member.setMemberPhone("18295807525");
        member.setMemberEmail("397442219@qq.com");
        member.setMemberAddress("花城学院");
        member.setMemberLevel(1);
        Memberlevel memberlevel = new Memberlevel();
        memberlevel.setLevelName("白银");
        memberlevel.setLevelNum(2);
        memberDto.setMember(member);
        memberDto.setMemberlevel(memberlevel);
        int i = memberService.addMember(memberDto);
        return ResponseEntity.success(i);
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    public ResponseEntity test2() throws ServerException {
        List<MemberDto> allMembers = memberService.getAllMembers();
        return ResponseEntity.success(allMembers);
    }

    @RequestMapping("/delByid")
    @ResponseBody
    public ResponseEntity test3() throws ServerException {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        int i = memberService.delMember(list);
        return ResponseEntity.success(i);
    }


    @RequestMapping("/insertBatch")
    @ResponseBody
    public ResponseEntity test4() throws ServerException {
        List<MemberDto> list = new LinkedList<>();

        MemberDto memberDto = new MemberDto();
        Member member = new Member();
        member.setMemberName("毛子鹏");
        member.setMemberGender("男");
        member.setMemberPhone("18295807525");
        member.setMemberEmail("397442219@qq.com");
        member.setMemberAddress("花城学院");
        member.setMemberLevel(1);
        Memberlevel memberlevel = new Memberlevel();
        memberlevel.setLevelName("白银");
        memberlevel.setLevelNum(2);
        memberDto.setMember(member);
        memberDto.setMemberlevel(memberlevel);


        MemberDto memberDto2 = new MemberDto();
        Member membe2r = new Member();
        membe2r.setMemberName("毛子鹏");
        membe2r.setMemberGender("男");
        membe2r.setMemberPhone("18295807525");
        membe2r.setMemberEmail("397442219@qq.com");
        membe2r.setMemberAddress("花城学院");
        membe2r.setMemberLevel(1);
        Memberlevel memberlevel2 = new Memberlevel();
        memberlevel2.setLevelName("白银");
        memberlevel2.setLevelNum(2);
        memberDto2.setMember(member);
        memberDto2.setMemberlevel(memberlevel);

        list.add(memberDto);
        list.add(memberDto2);
        memberService.addBanthMember(list);
        return ResponseEntity.success(1);
    }


    @RequestMapping("/add2")
    @ResponseBody
    public ResponseEntity test22() throws ServerException {
        User u = new User();
        u.setId(11);
        u.setUsername("mmm");
        u.setPassword("123");
        System.out.println(123);
        int i = memberService.addMember2(u);
        return ResponseEntity.success(i);
    }

}
