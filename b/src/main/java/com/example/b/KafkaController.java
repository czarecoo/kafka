package com.example.b;

import com.example.b.kafka.ATopicSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private ATopicSender aTopicSender;

    public KafkaController(ATopicSender aTopicSender) {
        this.aTopicSender = aTopicSender;
    }

    @GetMapping
    public void greet() {
        aTopicSender.sendMessage("Hello from B");
    }
}