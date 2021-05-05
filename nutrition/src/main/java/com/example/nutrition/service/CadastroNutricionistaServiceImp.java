package com.example.nutrition.service;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.repository.NutricionistaRepository;
import com.example.nutrition.resouce.model.NutricionistaResource;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroNutricionistaServiceImp {

    @Autowired
    private NutricionistaRepository nutricionistaReository;

    @Autowired
    private NutricionistaConversor service;

    private static final Logger LOG = Logger.getLogger(CadastroNutricionistaServiceImp.class);

    public void cadastro(NutricionistaResource nutricionistaResource){
        try {
            Nutricionista nutricionista = service.conversor(nutricionistaResource);
            nutricionistaReository.saveAndFlush(nutricionista); //salva o objeto dentro do banco de dados
        }catch (NullPointerException e){
            LOG.error("Erro ao salvar o Nutricionista: " + e.getMessage(), e);
        }
        //to fazendo essa aula com o meu amor
    }
}
