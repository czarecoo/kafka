package com.example.a.kafka;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class ATopicListener {
    @KafkaListener(topics = "${a.topic}")
    void listener(String data) {
        log.info(data);
    }
}