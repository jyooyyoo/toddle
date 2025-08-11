package com.four.toddle.dto;

import lombok.Data;

public class RouteDTO {

    @Data
    public class RouteReq {
        private String currLat;
        private String currLng;
        private String destLat;
        private String destLng;
    }

    @Data
    public class RouteRes {
        private String listLevel;
        private String time;
        private String distance;
    }
}
