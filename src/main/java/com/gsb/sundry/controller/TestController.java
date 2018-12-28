package com.gsb.sundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-11-23
 * @time 14:58
 * @description
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }
}
