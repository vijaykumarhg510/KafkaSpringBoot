package com.example.Prod.service;

import com.example.Prod.model.PRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProdService {

    @Autowired
    private KafkaTemplate<String, PRequestDto> kafkaTemplate;


    public void publishRequest(PRequestDto PRequestDto) {
        this.kafkaTemplate.send("newTopic", PRequestDto);
    }
}
