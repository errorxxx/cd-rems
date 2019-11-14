package com.cd.rems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String test() {
        return "index";
    }


}
