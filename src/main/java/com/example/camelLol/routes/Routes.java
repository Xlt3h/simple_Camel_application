package com.example.camelLol.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class Routes  extends RouteBuilder{

    @Override
    public void configure() throws Exception
    {
        restConfiguration().component("servlet").port(8087); // localhost:8080

        rest("/api")
        .post("/xml")
        
        //.consumes("text/xml")
        .to("direct:xmlIn"); //localhost:8080/camel/api/xml

        
        from("direct:xmlIn")
        .log(" ${body}")
        .bean(Jambo.class,"hello")
        .log("${body}")
        ;
    }
    
}
