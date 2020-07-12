package com.qf.domain.dto;

import com.qf.domain.entity.Member;
import com.qf.domain.entity.Memberlevel;
import lombok.Data;

@Data
public class MemberDto {
    private Member member;
    private Memberlevel memberlevel;
}
