package com.example.ioc_spring;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {

    IEncoder iEncoder ;


    public Encoder(@Qualifier("base74Encoder") IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return this.iEncoder.encode(message);
    }

}
