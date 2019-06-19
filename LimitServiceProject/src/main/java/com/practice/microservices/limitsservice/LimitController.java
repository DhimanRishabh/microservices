package com.practice.microservices.limitsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    LimitConfiguration limitConfiguration;

    @GetMapping("/getAll")
    public LimitBean getAllLimits() {

        return new LimitBean(limitConfiguration.getMin(), limitConfiguration.getMax());
    }
}
