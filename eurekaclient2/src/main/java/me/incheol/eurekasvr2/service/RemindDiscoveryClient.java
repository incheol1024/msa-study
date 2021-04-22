package me.incheol.eurekasvr2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class RemindDiscoveryClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RemindFeignClient remindFeignClient;

    @Autowired
    private RestTemplate restTemplate;


    public String getRemind() {
        return remindFeignClient.getRemind();
//        return restTemplate.getForObject(URI.create("http://remind/remind/name"), String.class);
    }

}
