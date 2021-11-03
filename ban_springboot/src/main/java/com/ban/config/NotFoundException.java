package com.ban.config;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//继承  ErrorController + @ControllerAdvice + @ExceptionHandle 处理一切异常
//已知@ControllerAdvice + @ExceptionHandle可以处理 除 404 以外的 运行异常，那么，捕获不到的异常就是404

@Controller
public class NotFoundException implements ErrorController {

    @RequestMapping(value = {"/error"})
    @ResponseBody
    public Object error(HttpServletRequest request) {
        Map<String, Object> body = new HashMap<>();
        body.put("error", "not found");
        body.put("code", "404");
        return body;
    }
}
