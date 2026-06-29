package com.arquitetura_spring.ArquiteturaSpring.montadora;

import lombok.Data;

@Data
public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipo;
}
