package com.example.a;

import com.example.a.kafka.BTopicSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private BTopicSender BTopicSender;

    public KafkaController(BTopicSender BTopicSender) {
        this.BTopicSender = BTopicSender;
    }

    @GetMapping
    public void greet() {
        BTopicSender.sendMessage("Hello from A");
    }
}