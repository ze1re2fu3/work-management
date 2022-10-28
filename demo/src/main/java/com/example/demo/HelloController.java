package com.example.demo;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloController{

    @RequestMapping("/")
        public String home(){
            return "Hello World!";
        }
}