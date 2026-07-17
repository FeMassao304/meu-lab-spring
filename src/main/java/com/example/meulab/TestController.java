package com.example.meulab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String dizerOla(){
        return "Ola, Helm e Github Actions!\n";
    }
}
