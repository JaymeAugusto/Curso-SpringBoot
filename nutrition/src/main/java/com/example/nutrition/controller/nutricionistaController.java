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
    private NutricionistaRepository nutricionistaRepository;

    @GetMapping(path = "/nutricionistas")
    public List<Nutricionista> buscarNutricionistas(){
        return nutricionistaRepository.findAll();
    }

    @GetMapping(path = "/nutricionista/id/{id}")
    public Optional<Nutricionista> buscarNutricionistasPorId(
            @PathVariable(name = "id", required = true) Long id){
        return nutricionistaRepository.findById(id);
    }

    @PostMapping(path = "/nutricionista/save")
    public void salvarNutricionista(@RequestBody Nutricionista nutricionista){
        nutricionistaRepository.save(nutricionista);
    }

    @DeleteMapping(path = "/nutricionista/delete/{id}")
    public void deleteNutricionista(@PathVariable(name = "id", required = true) Long id){
        nutricionistaRepository.deleteById(id);
    }
}
