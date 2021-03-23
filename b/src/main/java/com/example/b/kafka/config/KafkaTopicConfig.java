package com.example.b.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {
    @Value("${a.topic}")
    private String aTopic;

    @Value("${b.topic}")
    private String bTopic;

    @Bean
    public NewTopic aTopic() {
        return TopicBuilder.name(aTopic).build();
    }

    @Bean
    public NewTopic bTopic() {
        return TopicBuilder.name(bTopic).build();
    }
}
