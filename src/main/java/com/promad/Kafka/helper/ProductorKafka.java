package com.promad.Kafka.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductorKafka {

    @Autowired
    private KafkaTemplate<String, String> template;

    private final String topic = "devops_topic2";

    public void sendMessage(String message) {
        template.send(topic, message);
    }
}
