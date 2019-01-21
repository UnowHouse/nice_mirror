package com.zhu.myException;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.myException
 *  @文件名:   MyException
 *  @创建者:   Unow
 *  @创建时间:  2018/11/19 10:35
 *  @描述：    TODO
 */

public class MyException extends RuntimeException{
    private ExceptionEnum exceptionEnum;

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public MyException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public MyException() {
    }
}
