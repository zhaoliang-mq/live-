package com.fh.common;

public enum ServerEnum {
    SUCCESS(200,"操作成功"),
    ERROR(1001,"操作失败"),
    LOGIN_ERROR(1002,"登陆失败"),
    PRODUCT_NOT_EXIST(1003,"商品不存在"),
    PRODUCT_IS_DOWN(1004,"判断商品是否上架"),
    CART_IS_NULL(1005,"购物车为空")

    ;
    private int code;
    private String msg;

    ServerEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    ServerEnum() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
