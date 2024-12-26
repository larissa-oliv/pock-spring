package com.larissa.pock_spring_app.controller;

import com.larissa.pock_spring_app.domain.User;
import com.larissa.pock_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWord() {
        return helloWordService.helloWord(" Larissa");
    }

    @PostMapping("")
    public String helloWordPost(@RequestBody User body) {
        return "Hello Word " + body.getName();
    }
}