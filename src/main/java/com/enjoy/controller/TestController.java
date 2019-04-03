package com.enjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/git")
public class TestController {

    @RequestMapping(value = "/test")
    public Object test(){
        return "Hello , git , I'm branch king !";
    }
}
