package com.springBasics.spring.basics.springDemo;

import com.springBasics.spring.basics.springDemo.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		System.out.println(personDAO);
		System.out.println(personDAO.getXmlJdbc());
	}

}
