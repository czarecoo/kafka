package com.example.b.kafka;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class BTopicListener {
    @KafkaListener(topics = "${b.topic}")
    void listener(String data) {
        log.info(data);
    }
}