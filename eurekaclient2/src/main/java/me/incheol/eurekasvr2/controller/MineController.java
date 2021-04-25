package me.incheol.eurekasvr2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MineController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/name")
    public String myAppName() {
        return applicationName;
    }


}
