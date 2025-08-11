package com.four.toddle.service;

import com.four.toddle.dto.RouteDTO;
import com.four.toddle.dto.SafeZoneDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RootService {

    public List<SafeZoneDTO.safeZoneRes> getSafeZones(SafeZoneDTO.safeZoneReq reqDTO) {
        return null;
    }

    public List<RouteDTO.RouteRes> getRoutes(RouteDTO.RouteReq reqDTO) {
        return null;
    }
}
