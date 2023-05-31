package com.springBasics.spring.basics.springDemo;

import com.springBasics.spring.basics.springDemo.basic.BinarySearch;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringBasicsApplication {
	public static void main(String[] args) {
//		BinarySearch binarySearch = new BinarySearch();
//		int res = binarySearch.binarySearch(new int[]{22,5,6},5);
//		System.out.println(res);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
//		BinarySearch binarySearch1 = context.getBean(BinarySearch.class);    //prototype instance
		int res = binarySearch.binarySearch(new int[]{1,3,2,5,4},6);
		System.out.println(res);
	}

}
