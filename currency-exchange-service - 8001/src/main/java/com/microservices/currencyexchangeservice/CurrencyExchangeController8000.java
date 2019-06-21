package com.microservices.currencyexchangeservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController8000 {

    Logger log= LoggerFactory.getLogger(CurrencyExchangeController8000.class);

    @Autowired
    Environment environment;
    @GetMapping("/currency-exchange/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {

        log.warn("{}","from cuurency exchange --->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        return new ExchangeValue(100L, from, to, BigDecimal.valueOf(65),Integer.parseInt(environment.getProperty("local.server.port")));
    }
}
