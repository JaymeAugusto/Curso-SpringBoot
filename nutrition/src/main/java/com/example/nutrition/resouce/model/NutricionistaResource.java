package com.example.nutrition.resouce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NutricionistaResource{

    @JsonProperty("nome_nutricionista")
    private String nome;

    @JsonProperty("idade")
    private String idade;

    @JsonProperty("codigo_registro")
    private String codigoRegistro;

    @JsonProperty("id_paciente")
    private String idPaciente;

    @Override
    public String toString() {
        return "NutricionistaResource{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", codigoRegistro='" + codigoRegistro + '\'' +
                ", idPaciente='" + idPaciente + '\'' +
                '}';
    }
}
