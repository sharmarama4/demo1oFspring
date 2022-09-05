package com.example1.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@org.springframework.web.bind.annotation.RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
    @RequestMapping(value="/controller", method=GET)
    public String foo() {
        return "Response!";
    }
}
