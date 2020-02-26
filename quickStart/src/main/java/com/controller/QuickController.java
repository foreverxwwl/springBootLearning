package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @outhor li
 * @create 2020-02-26 10:48
 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "springBoot";
    }
}
