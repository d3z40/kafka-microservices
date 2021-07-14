package br.com.dezao.envia.broker.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    @Value("${topic.name.envia}")
    private String topicName;

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String msg) {
        log.info("Payload enviado: " + msg);
        kafkaTemplate.send(topicName, msg);
    }
}