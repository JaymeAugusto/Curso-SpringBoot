package com.example.nutrition.controller;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class nutricionistaController {

    @Autowired
    private NutricionistaReository nutricionistaReository;

    @GetMapping(path = "api/nutricionista-id{}")
    public ResponseEntity<Optional<Nutricionista>> buscarNutricionistaPorId(
            @PathVariable(name = "id", required = true) Long idNutricionista){
        return ResponseEntity.ok(nutricionistaReository.findById(idNutricionista));

        //final
    }
}
