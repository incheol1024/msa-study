package com.example.circuitbreaker.controller;

import com.example.circuitbreaker.service.VisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app-name")
@RequiredArgsConstructor
public class VisionController {

    private final VisionService visionService;

    @GetMapping("/{name}")
    public String findAppName(@PathVariable("name") String name) {
        return visionService.visionServiceAppName(name);
    }
}
