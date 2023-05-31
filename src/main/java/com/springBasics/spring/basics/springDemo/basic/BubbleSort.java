package com.springBasics.spring.basics.springDemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm{
    public int sort(int[] numbers){
        System.out.println("Bubble sorting");
        return 3;
    }
}
