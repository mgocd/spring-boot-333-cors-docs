package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.DemoAppConstants.AUTHENTICATED_ENDPOINT;

@RestController
public class TestController {

    @GetMapping(value = AUTHENTICATED_ENDPOINT)
    public String authenticated() {
        return "OK";
    }
}
