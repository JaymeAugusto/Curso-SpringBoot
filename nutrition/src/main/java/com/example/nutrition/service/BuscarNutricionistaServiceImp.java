package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarNutricionistaServiceImp {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public List<Nutricionista> buscarTodosOsNutricionistas(){
        List<Nutricionista> listNutricionista =
                nutricionistaRepository.findAll();
        return listNutricionista;
    }
}
