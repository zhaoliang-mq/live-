package com.fh.gift.common;

public class ResponseCode {

    private Integer code;

    private String message;

    private Object data;



    public static ResponseCode success(Object data){
        return new ResponseCode(200,"操作成功",data);
    }
    public static ResponseCode success(){
        return new ResponseCode(200,"操作成功！");
    }
    public static ResponseCode error(Object data){
        return new ResponseCode(201,"操作失败",data);
    }

    public static ResponseCode error(){
        return new ResponseCode(201,"操作失败！");
    }

    public ResponseCode() {
    }

    public ResponseCode(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
