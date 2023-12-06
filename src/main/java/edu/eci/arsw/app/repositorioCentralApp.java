package edu.eci.arsw.app;

import java.io.IOException;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories("edu.eci.arsw.app.ucord.persistence")
public class repositorioCentralApp {

    /**
     * CLASE FUNDAMENTAL PARA INICIAR LA APLICACION !!!
     * @param args
     */
    public static void main(String[] args) throws IOException {
        SpringApplication app = new SpringApplication(repositorioCentralApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
        app.run(args);
    }

    //Obtener el puerto para Heroku de sus variables de entorno
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }
}
