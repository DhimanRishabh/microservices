package com.microservices.currencyconversion;


import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {

    @Autowired
    Environment environment;


    @Autowired
    CurrencyExchangeServerProxy cUrrencyExchangeServerProxy;

    @GetMapping("currency-conversion/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean getConversionValue(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable Integer quantity) {
//        Map<String,String> uriV=new HashMap<>();
//        uriV.put("from",from);
//        uriV.put("to",to);
//
//                ResponseEntity<CurrencyConversionBean> responseEntity= new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/{from}/to/{to}",CurrencyConversionBean.class,uriV);
//        CurrencyConversionBean currencyConversionBean=    responseEntity.getBody();
        CurrencyConversionBean currencyConversionBean= cUrrencyExchangeServerProxy.exchangeValue(from,to);
        return new CurrencyConversionBean(100, currencyConversionBean.getFrom(), currencyConversionBean.to, quantity*currencyConversionBean.getExchangeRate(), currencyConversionBean.getPort(), quantity, currencyConversionBean.getExchangeRate());

    }


}
