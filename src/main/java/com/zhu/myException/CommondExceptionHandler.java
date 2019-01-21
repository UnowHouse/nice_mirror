package com.zhu.myException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.myException
 *  @文件名:   CommondExceptionHandler
 *  @创建者:   Unow
 *  @创建时间:  2018/11/19 10:41
 *  @描述：    TODO
 */
@ControllerAdvice
public class CommondExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResult> handleException(MyException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
