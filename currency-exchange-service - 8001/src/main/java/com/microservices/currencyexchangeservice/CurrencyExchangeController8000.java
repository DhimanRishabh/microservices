package com.microservices.currencyexchangeservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController8000 {


    @Autowired
    Environment environment;
    @GetMapping("/currency-exchange/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
        return new ExchangeValue(100L, from, to, BigDecimal.valueOf(65),Integer.parseInt(environment.getProperty("local.server.port")));
    }
}
