package cn.com.liquanan.gradleWebDemo.handler;

import cn.com.liquanan.gradleWebDemo.common.HttpResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public HttpResult<Object> ExceptionHandler(HttpServletRequest request,Exception e) {
        HttpResult<Object> result=new HttpResult<>();
        result.setCode(-1);
        result.setMsg(e.getMessage());
        return result;

    }


}
