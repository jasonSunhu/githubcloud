package com.sunhu.web.common;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/4.
 */
//@Component
public class CommonErrorPageRegistry implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
        ErrorPage e400 = new ErrorPage(HttpStatus.BAD_REQUEST, "/404.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
        errorPageRegistry.addErrorPages(e400,e404,e500);
    }
}
