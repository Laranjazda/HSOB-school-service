package com.schoolservice.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "alunos")
@Getter
@Setter
public class Aluno {
    private ObjectId id;
    private String nome;
    private Date dataNascimento;
    private Curso curso;
    private List<Nota> notas;
    private List<Habilidade> habilidades;
}
