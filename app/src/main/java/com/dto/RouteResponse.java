package com.dto;


import com.dto.Location; // 변경된 부분
import java.util.List;

public class RouteResponse {
    private List<Location> path;

    public RouteResponse(List<Location> path) {
        this.path = path;
    }

    // Getters and Setters
    public List<Location> getPath() {
        return path;
    }

    public void setPath(List<Location> path) {
        this.path = path;
    }
}
```java