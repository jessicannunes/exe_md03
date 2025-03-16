package com.devsuperior.exe_md03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @GetMapping
    public String test(){
        return "programação é coisa de maluco";
    }
}
