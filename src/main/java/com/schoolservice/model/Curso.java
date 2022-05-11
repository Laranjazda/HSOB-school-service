package com.schoolservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;

@Document(collection = "cursos")
@Getter
@Setter
public class Curso {
    private String nome;
}
