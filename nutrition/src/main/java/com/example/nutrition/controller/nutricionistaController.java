package com.example.nutrition.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nutricionistaController {

    @GetMapping(path = "api/nutricionista-id{}")
    public void buscarNutricionistaPorId(){

    }
}
