package com.example.circuitbreaker.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class VisionService {

    private final RestTemplate restTemplate;

    @HystrixCommand
    public String visionServiceAppName(String name) {
        return restTemplate.getForObject(URI.create("http://" + name + "/my/name"), String.class);
    }
}
