package com.company.my.testmyspringbootstarter.Controller;

import com.company.my.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @GetMapping("/hello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
