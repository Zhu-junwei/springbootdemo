package com.zjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping({"/hello", "/index"})
    public String index() {
        return "index2.html";
    }
}
