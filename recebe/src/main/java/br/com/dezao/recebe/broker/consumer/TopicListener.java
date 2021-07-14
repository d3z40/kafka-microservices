package br.com.dezao.recebe.broker.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicListener {

    @Value("${topic.name.recebe}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.recebe}", groupId = "${spring.kafka.producer.group-id}")
    public void consume(ConsumerRecord<String, String> consumerRecord) {
        log.info("Tópico: {}", topicName);
        log.info("key: {}", consumerRecord.key());
        log.info("Headers: {}", consumerRecord.headers());
        log.info("Partion: {}", consumerRecord.partition());
        log.info("Order: {}", consumerRecord.value());
    }
}
