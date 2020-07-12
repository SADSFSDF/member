package com.qf.Exception;

import com.qf.utils.StatusEnum;

public class DaoException extends RuntimeException{
    private Integer status;
    private String msg;

    public DaoException(StatusEnum statusEnum) {
        this.status = statusEnum.getStatus();
        this.msg = statusEnum.getMsg();
    }

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
}
