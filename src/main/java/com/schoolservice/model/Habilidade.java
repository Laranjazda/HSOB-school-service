package com.schoolservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "habilidades")
@Getter
@Setter
public class Habilidade {
    private String nome;
    private String nivel;
}
