package com.example.Cons.controller;

import com.example.Cons.model.PRequest;
import com.example.Cons.model.PRequestDto;
import com.example.Cons.service.ConsumerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {


    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private ConsumerService consumerService;

    @PostMapping
    public void saveRecord(PRequest request){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        PRequestDto requestDto = modelMapper.map(request, PRequestDto.class);
        if(consumerService.saveRecord(requestDto)){
            System.out.println("Record saved: " + request);
        }else {
            System.out.println("Failed to save record: " + request);
        }
    }
}
