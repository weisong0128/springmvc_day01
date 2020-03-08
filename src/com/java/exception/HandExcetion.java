package com.java.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * description:
 * author: ws
 * time: 2020/3/3 22:11
 */
@ControllerAdvice   //表示controll包下任何一个类出现异常都会走HandExcetion这个类中的方法
public class HandExcetion {

    //Throwable:Error、Exception
    @ExceptionHandler(Exception.class)
    public String handExpt(Exception ex) {
        //将错误记录到日志中去
        System.out.println(ex.getMessage());
        return "redirect:/error.jsp";
    }

    //先是找更精确匹配的方法，比如是空指针异常，就会找下面这个方法优先调用
    @ExceptionHandler(NullPointerException.class)
    public String handNullExpt(NullPointerException ex) {
        //将错误记录到日志中去
        System.out.println("handNullExpt");
        return "redirect:/error.jsp";
    }

}
