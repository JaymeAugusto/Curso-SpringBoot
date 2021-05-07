package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.resouce.model.NutricionistaResource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class NutricionistaConversor {

    public Nutricionista conversor(NutricionistaResource nutricionistaResource){
        try {
            Nutricionista nutricionista = new Nutricionista();

            Long idPaciente = checkIdPaciente(nutricionistaResource.getIdPaciente());

            LocalDate idade = checkIdade(nutricionistaResource.getIdade());

            nutricionista.setidPaciente(idPaciente);
            nutricionista.setIdade(idade);
            nutricionista.setCodigoRegistro(nutricionistaResource.getCodigoRegistro());
            nutricionista.setNome(nutricionistaResource.getNome());

            return nutricionista;

        }catch (Exception e){
            throw new NegativeArraySizeException("Falha ao converter o resource para entidade, resource: " + nutricionistaResource);
        }

    }

    private Long checkIdPaciente(String idPaciente){
        return Long.parseLong(idPaciente);
    }

    private LocalDate checkIdade(String idade){
        return LocalDate.parse(idade);
    }
}
