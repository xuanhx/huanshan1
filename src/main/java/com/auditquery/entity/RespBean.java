package com.auditquery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private Integer status = 0;
    private String msg;
    private Object obj;

    public static RespBean build(){
        return new RespBean();
    }

    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }

    public static RespBean ok(String msg, Object obj){
        return new RespBean(200,msg,obj);
    }

    public static RespBean ok(Object obj){
        return new RespBean(200,"ok",obj);
    }

//    public static RespBean ok(Map map){
//        return new RespBean(200,"ok",map);
//    }

    public static RespBean warn(String msg){
        return new RespBean(204,msg,null);
    }

    public static RespBean warn(String msg, Object obj){
        return new RespBean(204,msg,obj);
    }

    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }

    public static RespBean error(String msg, Object obj){
        return new RespBean(500,msg,obj);
    }
}
