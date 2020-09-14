package com.example.springgeoip.service;

import com.example.springgeoip.model.GeoIP;
import com.maxmind.geoip2.exception.GeoIp2Exception;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface GeoIPLocationService {
    GeoIP getIpLocation(String ip, HttpServletRequest request) throws IOException, GeoIp2Exception;
}
