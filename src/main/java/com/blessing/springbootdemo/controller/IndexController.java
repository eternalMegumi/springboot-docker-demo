package com.blessing.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhou.peng
 * @date 2020-06
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "hello";
    }
}
