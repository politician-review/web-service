package com.politicianreview.webservice.exception;

import com.politicianreview.webservice.common.GlobalURI;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String rootExceptionHandler(Exception e) {
        log.error("Exception", e);
        return GlobalURI.REDIRECT + GlobalURI.ERROR_URI_500;
    }
}
