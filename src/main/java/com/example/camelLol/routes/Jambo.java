package com.example.camelLol.routes;

import org.springframework.stereotype.Component;

@Component
public class Jambo {
    public String hello(String input)
    {
        return "hello "+input;
    }
}
