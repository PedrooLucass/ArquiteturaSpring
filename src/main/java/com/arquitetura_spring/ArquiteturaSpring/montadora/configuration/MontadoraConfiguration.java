package com.arquitetura_spring.ArquiteturaSpring.montadora.configuration;

import com.arquitetura_spring.ArquiteturaSpring.montadora.Motor;
import com.arquitetura_spring.ArquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Primary // Caso eu tenha usado o @Autowired sem usar o @Qualifier, o Spring pegará esse @Bean por default
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-A");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(160);
        motor.setCilindros(4);
        motor.setModelo("XPTO-T");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("XPTO-E");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorHibrido")
    public Motor motorHibrido() {
        var motor = new Motor();
        motor.setCavalos(140);
        motor.setCilindros(3);
        motor.setModelo("XPTO-H");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.HIBRIDO);
        return motor;
    }
}
