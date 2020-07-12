package com.qf.utils;

public class ResponseEntity<T> {
    private Integer status;
    private String msg;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static<T> ResponseEntity<T> success(T t){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setMsg(StatusEnum.SUCCESS_STATUS.getMsg());
        responseEntity.setStatus(StatusEnum.SUCCESS_STATUS.getStatus());
        responseEntity.setData(t);
        return responseEntity;
    }
    public static<T> ResponseEntity<T> error(){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setMsg(StatusEnum.ERROR_STATUS.getMsg());
        responseEntity.setStatus(StatusEnum.ERROR_STATUS.getStatus());
        return responseEntity;
    }

    public static<T> ResponseEntity<T> error(StatusEnum statusEnum){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setMsg(statusEnum.getMsg());
        responseEntity.setStatus(statusEnum.getStatus());
        return responseEntity;
    }

    public static<T> ResponseEntity<T> error(int status ,String msg){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setMsg(msg);
        responseEntity.setStatus(status);
        return responseEntity;
    }

}
