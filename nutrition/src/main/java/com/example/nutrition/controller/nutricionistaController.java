package com.example.nutrition.controller;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apitest")
public class nutricionistaController {

    @Autowired
    private NutricionistaRepository nutricionistaReository;

    @GetMapping(path = "/nutricionistas")
    public List<Nutricionista> buscarNutricionistas(){
        return nutricionistaReository.findAll();
    }

    @GetMapping(path = "/nutricionista/id/{id}")
    public Optional<Nutricionista> buscarNutricionistasPorId(
            @PathVariable(name = "id", required = true) Long id){
        return nutricionistaReository.findById(id);
    }

    @PostMapping(path = "/nutricionista/save")
    public void salvarNutricionista(@RequestBody Nutricionista nutricionista){
        nutricionistaReository.save(nutricionista);
    }
}
