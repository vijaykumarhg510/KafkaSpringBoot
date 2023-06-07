package com.example.Prod.controller;

import com.example.Prod.model.PRequestDto;
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
    public String produceMessages(@RequestBody PRequestDto PRequestDto) {
        prodService.publishRequest(PRequestDto);
        return "posted";
    }
}
