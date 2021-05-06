package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarNutricionistaServiceImp {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public void buscarPorId(Long id){
        Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
        if (!optionalNutricionista.isPresent()){

        }


    }

    public void deletarPorId(Long id){
        nutricionistaRepository.deleteById(id);
    }
}
