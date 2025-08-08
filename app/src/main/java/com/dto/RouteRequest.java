package com.dto;


import com.dto.Location; // 변경된 부분

public class RouteRequest {
    private Location origin;
    private Location destination;

    public RouteRequest() {}

    // Getters and Setters
    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }
}
```java