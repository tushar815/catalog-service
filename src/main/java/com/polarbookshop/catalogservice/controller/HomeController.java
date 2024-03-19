package com.polarbookshop.catalogservice.controller;

import com.polarbookshop.catalogservice.config.PolarProperties;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

private final PolarProperties polarProperties;

    @GetMapping("/")
    public String getGreeting() {
        return polarProperties.getGreeting();
    }
}
