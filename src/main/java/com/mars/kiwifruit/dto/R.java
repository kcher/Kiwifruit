package com.mars.kiwifruit.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class R implements Serializable {


     private static final long serialVersionUID = -7156554523930420001L;

     private static final String SUCCESS = "SUCCESS";
     private static final String ERROR = "ERROR";

     private String status;

     private String code = "200";

     private String msg;

     private Object data;


     public static R ok(String msg, Object data) {
         R r = new R();
         r.setStatus(SUCCESS);
         r.setMsg(msg);
         r.setData(data);
         return r;
     }

     public static R ok() {
         return ok(null, null);
     }

     public static R ok(String msg) {
         return ok(msg, null);
     }

     public static R error(String code, String msg) {
         R r = new R();
         r.setStatus(ERROR);
         r.setCode(code);
         r.setMsg(msg);
         return r;
     }


}
