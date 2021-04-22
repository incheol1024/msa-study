package me.incheol.eurekasvr2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "remind")
public interface RemindFeignClient {

    @RequestMapping(value = "/remind/name", consumes = "application/json")
    String getRemind();
}
