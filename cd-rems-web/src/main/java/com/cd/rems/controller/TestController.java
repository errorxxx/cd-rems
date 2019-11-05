package com.cd.rems.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Test")
public class TestController {
    @RequestMapping(method = RequestMethod.GET,value = "test")
    public String test() {
        return "Hello world";
    }
}
