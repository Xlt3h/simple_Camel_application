package com.example.camelLol.Config;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.camelLol.routes.Jambo;

@Configuration
public class AppConfig 
{
    @Autowired
    private CamelContext context;

    @Bean
    public ProducerTemplate producerTemplate()
    {
        return context.createProducerTemplate();
    }

    @Bean 
    public Jambo jambo()
    {
        return new Jambo();
    }
    
    
}
