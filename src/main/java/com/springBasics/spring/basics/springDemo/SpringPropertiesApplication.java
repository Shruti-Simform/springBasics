package com.springBasics.spring.basics.springDemo;

import com.springBasics.spring.basics.springDemo.property.SomeExternalProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("app.properties")
public class SpringPropertiesApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringPropertiesApplication.class);
		SomeExternalProperty service = context.getBean(SomeExternalProperty.class);
		System.out.println(service);
		System.out.println(service.returnServiceURL());
	}

}
