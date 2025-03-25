package com.mallik.chat.application.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @GetMapping("/{userId}")
    public String sayHello(@PathVariable("userId") String userId) {
        System.out.println(userId);
        return "Hello, World!";
    }

}
