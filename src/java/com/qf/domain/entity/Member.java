package com.qf.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Member {
    private Integer memberId;

    private String memberName;

    private String memberGender;

    private String memberPhone;

    private String memberEmail;

    private String memberAddress;

    private Date memberCreatetime;

    private Integer memberLevel;

    private Integer memberStatus;
}