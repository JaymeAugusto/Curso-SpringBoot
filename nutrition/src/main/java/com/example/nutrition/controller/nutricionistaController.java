package com.example.nutrition.controller;

import com.example.nutrition.datasousce.model.Nutricionista;
import com.example.nutrition.exception.NutricionistaNotfoundException;
import com.example.nutrition.resouce.model.NutricionistaResource;
import com.example.nutrition.service.BuscarNutricionistaPorIdServiceImp;
import com.example.nutrition.service.BuscarNutricionistasServiceImp;
import com.example.nutrition.service.CadastroNutricionistaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apitest")
public class nutricionistaController {

    @Autowired
    private BuscarNutricionistasServiceImp seviceBuscar;

    @Autowired
    private CadastroNutricionistaServiceImp serviceCadastro;

    @Autowired
    private BuscarNutricionistaPorIdServiceImp serviceBuscarPorId;

    @GetMapping(path = "/nutricionistas")
    public List<Nutricionista> buscarNutricionistas(){
        return seviceBuscar.buscarTodosOsNutricionistas();
    }

    @GetMapping(path = "/nutricionista/id/{id}")
    public Nutricionista buscarNutricionistasPorId(@PathVariable(name = "id", required = true) Long id)
            throws NutricionistaNotfoundException {
        return serviceBuscarPorId.buscarPorId(id);
    }

    @PostMapping(path = "/nutricionista/save")
    public void salvarNutricionista(@RequestBody NutricionistaResource nutricionista){
        serviceCadastro.cadastro(nutricionista);
    }

    @DeleteMapping(path = "/nutricionista/delete/{id}")
    public void deleteNutricionista(@PathVariable(name = "id", required = true) Long id)
            throws NutricionistaNotfoundException {
        serviceBuscarPorId.deletarPorId(id);
    }
}
