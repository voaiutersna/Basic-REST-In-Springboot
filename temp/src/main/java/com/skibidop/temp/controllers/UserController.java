package com.skibidop.temp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skibidop.temp.dtos.User;

//เป็นการบอกว่าไฟล์นี้ทำอะไร
@RestController
public class UserController {

    @GetMapping("/hello") //rest api (GET METHOD)
    public User sayHello(){
        return new User("skibidop",67);
    }
    @PostMapping("/hello")
    public User postUser(@RequestBody User user){
        return user;
    }

    // public class Message {
    // @JsonProperty("body")
    // private String content;  // รับค่า จาก field "body" ไปใส่ content
    
    // @JsonProperty("sender")
    // private String sender;   // รับค่า จาก field "sender" ไปใส่ sender
    // }

}
