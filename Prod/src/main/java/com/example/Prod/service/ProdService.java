package com.example.Prod.service;

import com.example.Prod.model.PRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProdService {

    @Autowired
    private KafkaTemplate<String, PRequest> kafkaTemplate;


    public void publishRequest(PRequest PRequest){
        this.kafkaTemplate.send("newTopic", PRequest);
    }
}
