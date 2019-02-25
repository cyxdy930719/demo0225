package com.neuedu.common;
/*
* 服务端返回给前端的高复用的响应对象
* */
public class ServerResponse<T>{
    private int status;//返回给前端的状态码
    private String msg;//当status！=0时，封装了错误信息；
    private T data;//返回给前端的数据

    private ServerResponse() {
    }
    private ServerResponse(int status) {
        this.status = status;
    }

    private ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }
/*
* 调用接口成功，回调
* */
    //获取状态码0
    public static ServerResponse serverResponseBySuccess(){
        return new ServerResponse(ResponseCode.SUCCESS);
    }
    //获取数据
    public static <T> ServerResponse serverResponseBySuccess(T data){
        return new ServerResponse(ResponseCode.SUCCESS,data);
    }
    //获取数据和msg
    public static <T> ServerResponse serverResponseBySuccess(T data,String msg){
        return new ServerResponse(ResponseCode.SUCCESS,msg);
    }

    /*
    * 调用接口失败，回调
    * */
    //返回错误状态码
    public static ServerResponse serverResponseByError(){
        return new ServerResponse(ResponseCode.ERROR);
    }
    //返回错误信息
    public static ServerResponse serverResponseByError(String msg){
        return new ServerResponse(ResponseCode.ERROR,msg);
    }
    //返回自定义状态码，如地址，邮箱重复等
    public static ServerResponse serverResponse(int status,String msg){
        return new ServerResponse(status,msg);
    }
    public static ServerResponse serverResponse(int status){
        return new ServerResponse(status);
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

    /*
    * 判断接口是否正确返回
    * */
    public boolean isSuccess(){
        return this.status==ResponseCode.SUCCESS;
    }






}
