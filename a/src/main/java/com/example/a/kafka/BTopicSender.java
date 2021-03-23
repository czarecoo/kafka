package com.example.a.kafka;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Log
@Component
public class BTopicSender {
    private String bTopic;
    private KafkaTemplate<String, String> kafkaTemplate;

    public BTopicSender(@Value("${b.topic}") String bTopic, KafkaTemplate<String, String> kafkaTemplate) {
        this.bTopic = bTopic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(bTopic, message);
    }
}