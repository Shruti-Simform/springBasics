package com.springBasics.spring.basics.springDemo.basic;

import org.springframework.stereotype.Component;
@Component
//@Qualifier("quick")
public class QuickSort implements SortAlgorithm {
    public int sort(int[] numbers){
        System.out.println("Quick sorting");
        return 0;
    }
}
