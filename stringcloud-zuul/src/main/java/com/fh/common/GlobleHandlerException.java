package com.fh.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleHandlerException  {

    @ExceptionHandler(LoginException.class)
    public ServerResponse handlerLoginException(LoginException e){
        e.printStackTrace();
        return ServerResponse.login_error();

    }
    @ExceptionHandler(MyException.class)
    public ServerResponse handlerMyException(MyException e){
        e.printStackTrace();
        return ServerResponse.error();

    }

    @ExceptionHandler(Exception.class)
    public ServerResponse handlerException(Exception e){
        e.printStackTrace();
        return ServerResponse.error();

    }

}
