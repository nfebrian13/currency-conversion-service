package com.course.microservices.controller;

import com.course.microservices.bean.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean converterCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 0);
        return currencyConversionBean;
    }
}
