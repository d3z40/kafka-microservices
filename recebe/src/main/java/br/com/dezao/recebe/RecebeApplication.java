package br.com.dezao.recebe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class RecebeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecebeApplication.class, args);
    }

}
