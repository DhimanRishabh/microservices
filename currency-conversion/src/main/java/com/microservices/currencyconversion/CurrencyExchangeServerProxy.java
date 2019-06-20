package com.microservices.currencyconversion;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="netflix-zuul-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServerProxy {
    @GetMapping("/currency-exchange-service/currency-exchange/{from}/to/{to}")
    public  CurrencyConversionBean exchangeValue(@PathVariable("from") String from,@PathVariable("to") String to );
}
