package com.springBasics.spring.basics.springDemo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

//    public BinarySearch() {         //constructor injection
//        super();
//        System.out.println("Constructor injection");
//    }

//    public BinarySearch(SortAlgorithm sortAlgorithm) {
//        System.out.println("Constructor injection");
//        this.sortAlgorithm = sortAlgorithm;
//    }

//    public void setBubbleSort(SortAlgorithm sortAlgorithm) {       //setter injection
//        System.out.println("Setter injection");
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] arr, int n){
        int sortedNum = sortAlgorithm.sort(arr);
        System.out.println(sortAlgorithm);
        System.out.println("Sorting");
        return 1;
    }
}
