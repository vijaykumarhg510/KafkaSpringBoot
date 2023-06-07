package com.example.Cons.service;

import com.example.Cons.model.PRequest;
import com.example.Cons.repos.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private PRepository repository;

    public boolean saveRecord(PRequest requestDto){
        try{
            repository.save(requestDto);
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
