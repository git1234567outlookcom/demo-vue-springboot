package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @create: 20181231
 * @author: liu
 **/

@RestController
public class Hello {
    //    http://localhost:8080/test/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "Hello World";
    }


}
