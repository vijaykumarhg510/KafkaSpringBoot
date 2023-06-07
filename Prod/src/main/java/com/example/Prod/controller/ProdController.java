package com.example.Prod.controller;

import com.example.Prod.model.PRequest;
import com.example.Prod.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdController {

    @Autowired
    private ProdService prodService;


    @PostMapping
    public String produceMessages(@RequestBody PRequest PRequest){
        prodService.publishRequest(PRequest);
        return "posted";
    }
}
