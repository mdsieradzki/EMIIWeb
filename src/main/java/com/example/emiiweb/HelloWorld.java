package com.example.emiiweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("hello2")
    public String hello2() {
        return "Hello World but with anger!";
    }
}
