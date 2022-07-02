package com.example.gittest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @PostMapping("/user")
    public  String  user(){
        System.out.println("第一次修改");

        return  "ok";
    }
}
