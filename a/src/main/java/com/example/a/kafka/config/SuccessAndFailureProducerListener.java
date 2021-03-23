package com.example.a.kafka.config;

import lombok.extern.java.Log;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;

import static java.util.logging.Level.INFO;

@Log
public class SuccessAndFailureProducerListener<K, V> implements ProducerListener<K, V> {
    @Override
    public void onSuccess(ProducerRecord<K, V> producerRecord, RecordMetadata recordMetadata) {
        String successMessage = String.format("Message %s delivered with offset %s", producerRecord.value(), recordMetadata.offset());
        log.log(INFO, successMessage);
    }

    @Override
    public void onError(ProducerRecord<K, V> producerRecord, RecordMetadata recordMetadata, Exception exception) {
        String successMessage = String.format("Failed to deliver message %s", producerRecord.value());
        log.log(INFO, successMessage, exception);
    }
}