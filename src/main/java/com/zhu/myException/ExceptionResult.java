package com.zhu.myException;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.myException
 *  @文件名:   ExceptionResult
 *  @创建者:   Unow
 *  @创建时间:  2018/11/19 10:42
 *  @描述：    TODO
 */
public class ExceptionResult {
    private Integer code;
    private String msg;
    private Long timestamp;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ExceptionResult(ExceptionEnum em) {
        this.code = em.getCode();
        this.msg = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
