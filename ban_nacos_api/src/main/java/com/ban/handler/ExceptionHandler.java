package com.ban.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import org.springframework.stereotype.Component;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

// sentinel规则
// @Component
public class ExceptionHandler implements BlockExceptionHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {

        String error = "";
        if (e instanceof FlowException) {
            error="FlowException";
        } else if (e instanceof ParamFlowException) {
            error="ParamFlowException";
        }else if (e instanceof SystemBlockException) {
            error="SystemBlockException";
        }else if (e instanceof DegradeException) {
            error="DegradeException";
        } else if (e instanceof AuthorityException) {
            error="AuthorityException";
        } else {
            error="sentinel other Exception";
        }
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write(error);
        writer.close();
    }
}
