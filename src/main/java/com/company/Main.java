package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@EnableAutoConfiguration
public class Main {
    @RequestMapping("/")
    String home(){
        return "Hello World Lab Four";
    }
    public static void main(String[] args) throws Exception{
        SpringApplication app = new SpringApplication(Main.class);
        app.setDefaultProperties(Collections
                .<String, Object>singletonMap("server.port", "600"));
        app.run(new String[0]);
    }
}
