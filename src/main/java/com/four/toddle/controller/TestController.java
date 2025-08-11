package com.four.toddle.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public Map<String, Object> runtime(HttpServletRequest req) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("samLocal", System.getenv("AWS_SAM_LOCAL"));
        m.put("awsExecEnv", System.getenv("AWS_EXECUTION_ENV"));
        m.put("lambdaTaskRoot", System.getenv("LAMBDA_TASK_ROOT"));
        m.put("awsRegion", System.getenv("AWS_REGION"));
        m.put("xAmznTraceId", req.getHeader("X-Amzn-Trace-Id"));
        m.put("xForwardedProto", req.getHeader("X-Forwarded-Proto"));
        m.put("xForwardedFor", req.getHeader("X-Forwarded-For"));
        return m;
    }
}
