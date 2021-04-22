package me.incheol.eurekasvr2.controller;

import me.incheol.eurekasvr2.service.RemindDiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remind")
public class RemindController {

    @Autowired
    private RemindDiscoveryClient remindDiscoveryClient;

    @GetMapping("/host")
    public String getHosts() {
        return remindDiscoveryClient.getRemind();
    }
}
