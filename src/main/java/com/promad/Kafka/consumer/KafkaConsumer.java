package com.promad.Kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "devops_topic2", groupId = "bankaccConsumer")
    public void consume(String message){
        System.out.println("message = " + message);
    }
}
