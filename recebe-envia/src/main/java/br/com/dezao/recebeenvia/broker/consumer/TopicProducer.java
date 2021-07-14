package br.com.dezao.recebeenvia.broker.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.name.recebe}")
    private String topicName;

    public void send(String msg) {
        log.info("Payload enviado novamente: " + msg + " - Segunda mensagem - by d3z40");
        kafkaTemplate.send(topicName, msg + " - Segunda mensagem - by d3z40");
    }
}