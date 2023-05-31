package com.springBasics.spring.basics.springDemo;


import com.springBasics.spring.basics.springDemo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringScopeApplication {
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringScopeApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringScopeApplication.class);
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO1 = context.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbc());
		LOGGER.info("{}",personDAO.getJdbc());
		LOGGER.info("{}",personDAO.getJdbc());
		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbc());
	}
}
