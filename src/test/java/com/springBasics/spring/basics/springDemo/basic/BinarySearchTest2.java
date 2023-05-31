package com.springBasics.spring.basics.springDemo.basic;

import com.springBasics.spring.basics.springDemo.SpringBasicsApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringBasicsApplication.class)
public class BinarySearchTest2 {
    @Autowired
    BinarySearch binarySearch;

    @Test
    public void testBasic(){
        System.out.println(binarySearch);
        int res = binarySearch.binarySearch(new int[]{2,4},4);
        assertEquals(1,res);
    }

}