package com.springBasics.spring.basics.springDemo;


import com.springBasics.spring.basics.springDemo.cdi.CdiBusiness;
import com.springBasics.spring.basics.springDemo.cdi.CdiDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringCdiApplication {
//	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringCdiApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCdiApplication.class);
		CdiBusiness cdiDAO = context.getBean(CdiBusiness.class);
//		LOGGER.info("{}",cdiDAO);
		System.out.println(cdiDAO);
	}
}
