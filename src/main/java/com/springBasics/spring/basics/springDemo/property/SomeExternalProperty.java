package com.springBasics.spring.basics.springDemo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalProperty {
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        return url;
    }
}
