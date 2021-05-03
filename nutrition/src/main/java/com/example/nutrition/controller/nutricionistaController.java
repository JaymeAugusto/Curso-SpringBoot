package com.example.nutrition.controller;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apitest")
public class nutricionistaController {

    @Autowired
    private NutricionistaReository nutricionistaReository;

    @GetMapping(path = "nutricionistas")
    public List<Nutricionista> buscarNutricionistas(){
        return nutricionistaReository.findAll();
    }
}
