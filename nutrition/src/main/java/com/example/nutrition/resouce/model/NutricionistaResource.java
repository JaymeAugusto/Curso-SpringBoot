package com.example.nutrition.resouce.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource{

    @JsonProperty("nome_nuticionista")
    private String nome;

    @JsonProperty("idade")
    private String idade;

    @JsonProperty("codigo_registro")
    private String condigoRegistro;

    @JsonProperty("id_paciente")
    private String idPaciente;

    public NutricionistaResource
            (String nome, String idPaciente) {
        this.nome = nome;
        this.idPaciente = idPaciente;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCondigoRegistro() {
        return condigoRegistro;
    }

    public void setCondigoRegistro(String condigoRegistro) {
        this.condigoRegistro = condigoRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }
}
