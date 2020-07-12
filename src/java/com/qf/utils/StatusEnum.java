package com.qf.utils;

public enum StatusEnum {
    SUCCESS_STATUS(20000,"接口正常"),
    ERROR_STATUS(40000,"接口异常"),
    SERVICE_ERROR(40001,"业务层异常"),
    DAO_ERROR(40002,"DAO异常");

    private Integer status;
    private String msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    StatusEnum(Integer status) {
        this.status = status;
    }

    StatusEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
