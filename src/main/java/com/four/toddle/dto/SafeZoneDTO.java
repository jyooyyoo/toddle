package com.four.toddle.dto;

import lombok.Data;

public class SafeZoneDTO {

    @Data
    public class safeZoneReq {
        private String currLat;
        private String currLng;
    }

    @Data
    public class safeZoneRes {
        private String name;
        private String category;
        private String address;
        private String tel;
    }
}
