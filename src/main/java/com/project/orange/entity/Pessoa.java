package com.project.orange.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PESSOA_TBL")
public class Pessoa {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Nome é obrigatório")
    private String name;
    @NotBlank(message = "E-mail é obrigatório")
    private String email;
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;
    @NotBlank(message = "Data de nascimento é obrigatória")
    private String dataNascimento;
}
