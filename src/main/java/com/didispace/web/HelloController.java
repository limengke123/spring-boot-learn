package com.didispace.web;

import com.didispace.service.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    private BlogProperties bb;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }



}