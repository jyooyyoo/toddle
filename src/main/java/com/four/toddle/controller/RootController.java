package com.four.toddle.controller;

import com.four.toddle.dto.RouteDTO;
import com.four.toddle.dto.SafeZoneDTO;
import com.four.toddle.service.RootService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController("api/v1")
@RequiredArgsConstructor
public class RootController {

    RootService rootService;

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

    @GetMapping("/safezone")
    public ResponseEntity<List<SafeZoneDTO.safeZoneRes>> getSafeZones(SafeZoneDTO.safeZoneReq reqDTO) {
        List<SafeZoneDTO.safeZoneRes> resDTO = rootService.getSafeZones(reqDTO);
        return ResponseEntity.ok(resDTO);
    }

    @GetMapping("/route")
    public ResponseEntity<List<RouteDTO.RouteRes>> getRoutes(RouteDTO.RouteReq reqDTO) {
        List<RouteDTO.RouteRes> resDTO = rootService.getRoutes(reqDTO);
        return ResponseEntity.ok(resDTO);
    }
}
