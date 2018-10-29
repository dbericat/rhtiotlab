package com.redhat.iot.camel.aggreagate;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class Main {
    public static void main(String [] args) throws Exception{
        CamelContext ctx = new DefaultCamelContext();
        ctx.setTracing(true);
        ctx.addRoutes(new Route());
        ctx.start();
        Thread.sleep(600000);
        ctx.stop();
    }
}
