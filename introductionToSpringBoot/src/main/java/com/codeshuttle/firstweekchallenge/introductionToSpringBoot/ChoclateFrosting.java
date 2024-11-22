package com.codeshuttle.firstweekchallenge.introductionToSpringBoot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "frosting.type",havingValue="choclate")
@Component
@Primary
public class ChoclateFrosting implements Frosting{

    @Value("${frosting.type}")
    private String frostingType;
    @Override
    public String getFrostingType() {
        return frostingType;
    }
}


