package me.incheol.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remind")
public class RemindController {

    @GetMapping("/name")
    public String getName() {
        return "name:remind";
    }


}
