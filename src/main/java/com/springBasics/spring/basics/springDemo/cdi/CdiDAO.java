package com.springBasics.spring.basics.springDemo.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
public class CdiDAO {
    public int[] getData(){
        return new int[]{1,4,7};
    }
}
