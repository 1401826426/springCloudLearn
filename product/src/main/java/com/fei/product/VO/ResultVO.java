package com.fei.product.VO;

public class ResultVO<T> {

    private int status ;

    private String msg ;

    private T data ;

    public static <T> ResultVO<T> ok(T data) {
        return new ResultVO<>(0,data) ;
    }

    public ResultVO(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResultVO(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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
}
