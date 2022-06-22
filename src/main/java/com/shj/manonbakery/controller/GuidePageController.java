package com.shj.manonbakery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuidePageController {

    @GetMapping("/index")
    private String testHome() {
        return "/index";
    }

    @GetMapping("/left")
    private String testLeft() {
        return "/left-sidebar";
    }

    @GetMapping("/right")
    private String testRight() {
        return "/right-sidebar";
    }

    @GetMapping("/no_side")
    private String testNoSide() {
        return "/no-sidebar";
    }
}
