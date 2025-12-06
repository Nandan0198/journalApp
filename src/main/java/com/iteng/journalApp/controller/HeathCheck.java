package com.iteng.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeathCheck {

    @GetMapping("/Health-Check")
    public String healthcheck(){
        return "ok";
    }
}
