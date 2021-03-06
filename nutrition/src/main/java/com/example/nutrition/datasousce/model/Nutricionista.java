package com.example.nutrition.datasousce.model;

import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

    private static final long serialVersionUID = -2796979981601516225L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private LocalDate idade;

    @Column(name = "codigo_registro")
    private String codigoRegistro;

    @Column(name = "id_paciente", nullable = false)
    @NonNull
    private Long idPaciente;

    public Nutricionista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Long getidPaciente() {
        return idPaciente;
    }

    public void setidPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }
}
