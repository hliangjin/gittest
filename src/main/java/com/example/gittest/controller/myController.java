package com.example.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @PostMapping("/user")
    public  String  user(){
        System.out.println("第一次修改");

        System.out.println("第二次修改");
        System.out.println("第三次修改");
        System.out.println("第四次修改");

        return  "ok";
    }

    @GetMapping("/user")
    public  String  getUser(){
        System.out.println("新建DEC分支");

        return  "ok";
    }
}
