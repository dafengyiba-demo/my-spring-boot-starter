package com.company.my;

public class HelloService {

    HelloServiceProperties properties;

    public HelloServiceProperties getProperties() {
        return properties;
    }

    public void setProperties(HelloServiceProperties properties) {
        this.properties = properties;
    }

    public String sayHello(String name){
        return properties.getPrefix() +"-" + name + "-" + properties.getSuffix();
    }
}
