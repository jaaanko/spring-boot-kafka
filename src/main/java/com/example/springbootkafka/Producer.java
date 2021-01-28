package com.example.springbootkafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC = "my_topic";
    private KafkaTemplate<String, String> kafkaTemplate;

    public void writeMessage(String message) {
        this.kafkaTemplate.send(TOPIC, message);
    }
}
