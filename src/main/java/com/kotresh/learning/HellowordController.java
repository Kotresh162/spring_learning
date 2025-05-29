package com.kotresh.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowordController {
    @GetMapping(path = "/hello")
    public String helloworld(){
        return "hello java world!";
    }

    @GetMapping(path="/king")
    public  String kingmine(){
        return  "i am the king";
    }
}
