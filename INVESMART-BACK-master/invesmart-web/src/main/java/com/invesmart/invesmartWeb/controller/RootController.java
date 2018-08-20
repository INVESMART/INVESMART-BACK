package com.invesmart.invesmartWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping("/")
    public String root() {
        return "";
    }

    @RequestMapping("/info")
    public String info() {
        return "Invesmart Web Application:";
    }

}
