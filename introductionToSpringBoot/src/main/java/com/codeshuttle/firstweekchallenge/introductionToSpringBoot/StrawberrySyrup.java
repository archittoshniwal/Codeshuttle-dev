package com.codeshuttle.firstweekchallenge.introductionToSpringBoot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "syrup.type",havingValue="strawberry")
@Component
public class StrawberrySyrup implements Syrup{

    @Value("${syrup.type}")
    private String syrupType;
    @Override
    public String getSyrupType() {
        return syrupType;
    }
}
