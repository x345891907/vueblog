package com.xzh.vueblog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Result
 * @Description TODO
 * @Date 2020/6/22 22:15
 * @Created by xzh
 */
@Data
public class Result implements Serializable {

    private String code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        Result m = new Result();
        m.setCode("200");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static Result succ(String code ,String msg ,Object data) {
        Result m = new Result();
        m.setCode(code);
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static Result fail(String msg) {
        Result m = new Result();
        m.setCode("400");
        m.setData(null);
        m.setMsg(msg);
        return m;
    }
    public static Result fail(String msg ,Object data) {
        Result m = new Result();
        m.setCode("400");
        m.setData(data);
        m.setMsg(msg);
        return m;
    }
    public static Result fail(String code, String msg ,Object data) {
        Result m = new Result();
        m.setCode(code);
        m.setData(data);
        m.setMsg(msg);
        return m;
    }

}
