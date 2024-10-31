package com.andrea.WebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome home";
    }

    @RequestMapping("/about")
    public String about(){
        return "About us";
    }

}
