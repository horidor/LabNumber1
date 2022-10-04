package com.example.helloworldtruetrueweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldTrueTrueWebController {
    @GetMapping("/")
    @ResponseBody
    String helloTrueWorld() {
        return "Hello, true World!";
    }

    @GetMapping("/users")
    @ResponseBody
    String pointToThem() {
        return "Some users!";
    }

    @GetMapping("/users/HlazkovMaksym")
    @ResponseBody
    String hlazkovMaksym() {
        return "My name is Hlazkov Maksym. I am a student of IP-05 group. I think I'm not that bad at English, but I'm not proficient enough.";
    }

}
