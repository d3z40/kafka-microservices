package br.com.dezao.envia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class EnviaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnviaApplication.class, args);
    }

}
