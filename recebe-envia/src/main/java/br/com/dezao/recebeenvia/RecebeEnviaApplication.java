package br.com.dezao.recebeenvia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class RecebeEnviaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecebeEnviaApplication.class, args);
    }

}
