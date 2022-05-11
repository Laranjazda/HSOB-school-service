package com.schoolservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notas")
@Getter
@Setter
public class Nota {
    private Double valor;
}
