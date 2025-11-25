package io.github.cannudo.arquiteturaspring.montadora.configuration;

import io.github.cannudo.arquiteturaspring.montadora.Motor;
import io.github.cannudo.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {
    // beans são componentes que a gente pode usar dentro da aplicação

    @Bean
    public Motor motor() {
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);

        // esse "bean" vai ser registrado no container do Spring

        return motor;
    }
}
