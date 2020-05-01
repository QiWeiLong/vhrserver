package com.qwl.qwlvhr.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    //写个注解做一些改动，进行二次提交
    @GetMapping("/hello")
    public String getHello(){
        return "hello~~~~~";

    }
}
