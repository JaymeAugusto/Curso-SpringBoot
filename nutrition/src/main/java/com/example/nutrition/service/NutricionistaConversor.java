package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.resouce.model.NutricionistaResource;
import org.springframework.stereotype.Component;

@Component
public class NutricionistaConversor {

    public Nutricionista conversor(
            NutricionistaResource nutricionistaResource){

    }

    private Long checkIdPaciente(String idPaciente){
        return Long.parseLong(idPaciente);
    }
}
