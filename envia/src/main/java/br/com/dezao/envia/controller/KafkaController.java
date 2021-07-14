package br.com.dezao.envia.controller;

import br.com.dezao.envia.broker.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final TopicProducer topicProducer;

    @GetMapping("/send")
    public String send() {
        topicProducer.send("Primeira mensagem - by d3z40");
        return "Primeira mensagem - by d3z40";
    }
}
