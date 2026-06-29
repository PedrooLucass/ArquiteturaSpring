package com.arquitetura_spring.ArquiteturaSpring.montadora.api;

import com.arquitetura_spring.ArquiteturaSpring.montadora.CarroStatus;
import com.arquitetura_spring.ArquiteturaSpring.montadora.Chave;
import com.arquitetura_spring.ArquiteturaSpring.montadora.HondaHRV;
import com.arquitetura_spring.ArquiteturaSpring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorTurbo") // Caso o @Bean esteja sem o (name = "blablabla") o Spring ainda consegue achar pelo próprio nome da função
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
