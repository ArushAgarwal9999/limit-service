package com.example.microservices.limitsservice.controller;

import com.example.microservices.limitsservice.bean.Limit;
import com.example.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    Configuration configuration;

    @GetMapping(path = "/limits")
    public Limit getLimits()
    {
        return new Limit(configuration.getMin(),configuration.getMax());
    }
}
