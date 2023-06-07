package com.example.Cons.consumer;

import com.example.Cons.controller.ConsumerController;
import com.example.Cons.model.PRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    private ConsumerController consumerController;

    @KafkaListener(topics = "${kafka.topicName}", groupId = "${spring.kafka.consumer.group-id}",
            containerFactory = "containerFactory")
    public void kafkaConsumer(PRequestDto PRequestDto) {
        consumerController.saveRecord(PRequestDto);
    }

}
