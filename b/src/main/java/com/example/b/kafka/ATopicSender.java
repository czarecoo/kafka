package com.example.b.kafka;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Log
@Component
public class ATopicSender {
    private String aTopic;
    private KafkaTemplate<String, String> kafkaTemplate;

    public ATopicSender(@Value("${a.topic}") String aTopic, KafkaTemplate<String, String> kafkaTemplate) {
        this.aTopic = aTopic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(aTopic, message);
    }
}