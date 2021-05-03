package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CadastroNutricionista {
    @Autowired
    private NutricionistaRepository nutricionistaReository;

    public void cadastro(Nutricionista nutricionista){
        nutricionistaReository.saveAndFlush(nutricionista); //salva o objeto dentro do banco de dados
        //to fazendo essa aula com o meu amor
    }
}
