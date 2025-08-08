package com.controller;


import com.service.RouteService;
import com.dto.RouteRequest;
import com.dto.RouteResponse;
import com.dto.SafetyScoreResponse;
import com.dto.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RouteController {

    @Autowired
    private RouteService routeService;

    // 경로 탐색 API: 출발지, 도착지 좌표를 받아 최적의 안전 경로 반환
    @PostMapping("/routes")
    public ResponseEntity<RouteResponse> getSafeRoute(@RequestBody RouteRequest request) {
        // 경로 탐색 로직 호출
        RouteResponse response = routeService.findSafeRoute(request.getOrigin(), request.getDestination());
        return ResponseEntity.ok(response);
    }

    // 특정 위치의 안전 점수 조회 API
    @GetMapping("/safety_score")
    public ResponseEntity<SafetyScoreResponse> getSafetyScore(@RequestParam("latitude") double latitude, @RequestParam("longitude") double longitude) {
        // 안전 점수 조회 로직 호출
        SafetyScoreResponse response = routeService.getSafetyScore(latitude, longitude);
        return ResponseEntity.ok(response);
    }

    // 위치 검색 API: 키워드를 받아 위치 정보 반환
    @GetMapping("/search")
    public ResponseEntity<List<SearchResponse>> searchLocation(@RequestParam("keyword") String keyword) {
        // 위치 검색 로직 호출
        List<SearchResponse> response = routeService.searchLocation(keyword);
        return ResponseEntity.ok(response);
    }
}
```java