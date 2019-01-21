package com.zhu.myException;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.myException
 *  @文件名:   ExceptionEnum
 *  @创建者:   Unow
 *  @创建时间:  2018/11/19 10:36
 *  @描述：    TODO
 */

public enum ExceptionEnum {
    FACE_COULD_NOT_BE_DETECTED(400,"无法检测到人脸！"),
    FILE_IS_NULL(400,"图像文件不存在"),
    INVALID_FILE_TYPE(400,"图像文件类型不规范"),
    NOT_RECORD_FOUND(404,"排行榜无记录"),
    ;

    private Integer code;
    private String msg;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
    ExceptionEnum(){

    }
    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
