package com.repository;

import com.entity.SafetyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<SafetyData, Long> {
    // TODO: 사용자 정의 쿼리 메소드를 추가하여 안전 데이터 조회
    // 예: List<SafetyData> findByLatitudeBetweenAndLongitudeBetween(double lat1, double lat2, double lon1, double lon2);
}
```java
// src/main/java/com/saferoute/app/entity/SafetyData.java
