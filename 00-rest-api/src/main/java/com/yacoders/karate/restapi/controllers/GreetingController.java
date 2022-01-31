package com.yacoders.karate.restapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());


    @GetMapping(value = "/api/greeting", produces = "application/txt")
    public String greeting(@RequestParam(required=false, defaultValue = "Karate") String name) {
        logger.info("greeting called");
        return String.format("Hello %s!", name);
    }
}
