package com.example.springgeoip.web;

import com.example.springgeoip.model.GeoIP;
import com.example.springgeoip.service.GeoIPLocationService;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class GeoIPController {

    private final GeoIPLocationService geoIPLocationService;

    public GeoIPController(GeoIPLocationService geoIPLocationService) {
        this.geoIPLocationService = geoIPLocationService;
    }

    @GetMapping("/geoIP/{ipAddress}")
    public GeoIP getLocation(@PathVariable String ipAddress, HttpServletRequest request
    ) throws IOException, GeoIp2Exception {
        return geoIPLocationService.getIpLocation(ipAddress, request);
    }
}
