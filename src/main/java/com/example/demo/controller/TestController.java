package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/Hello")
    public String returnSomething(){

        return "Hello from controller";
    }

    @GetMapping("/Features")
    public String returnFeatures(){

        return "Hello from features";
    }

    @GetMapping("/loginFixedout")
    public String loginFixed(){

        return "login fixed";
    }

    @GetMapping("/ui-added")
    public String uiAdded(){

        return "UiAdded";
    }

    @GetMapping("/user-details")
    public String userdetails(){

        return "user details";
    }
}
