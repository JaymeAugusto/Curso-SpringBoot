package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.exception.NutricionistaNotfoundException;
import com.example.nutrition.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarNutricionistaPorIdServiceImp {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public Nutricionista buscarPorId(Long id) throws NutricionistaNotfoundException {
        Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
        Nutricionista nutricionista = null;
        if (!optionalNutricionista.isPresent()){
            throw new NutricionistaNotfoundException("Nutricionista não encontrado atraves do ID:" + id);
        } else {
            nutricionista = optionalNutricionista.get();
        }

        return nutricionista;
    }

    private Optional<Nutricionista> getOptional(Long id){
        Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
        return optionalNutricionista;
    }

    public void deletarPorId(Long id) throws NutricionistaNotfoundException {

        Optional<Nutricionista> optionalNutricionista = getOptional(id);
        if (!optionalNutricionista.isPresent()){
            throw new NutricionistaNotfoundException("Nutricionista não encontrado atraves do ID:" + id);
        } else {
            nutricionistaRepository.delete(optionalNutricionista.get());
        }
    }
}
