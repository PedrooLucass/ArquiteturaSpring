package com.arquitetura_spring.ArquiteturaSpring.montadora;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

@Data
@RequiredArgsConstructor
public class Carro {
    private String modelo;
    private Color cor;
    private Montadora montadora;

    @NonNull // Se fosse um final, poderia usar o @RequiredArgsConstructor sem usar o @NonNull
    private Motor motor;

    public CarroStatus darIgnicao(@RequestBody Chave chave) {
        if(chave.getMontadora() != this.montadora) {
            return new CarroStatus("Chave errada!");
        }
        return new CarroStatus("Ligando motor! "+ motor);
    }
}
