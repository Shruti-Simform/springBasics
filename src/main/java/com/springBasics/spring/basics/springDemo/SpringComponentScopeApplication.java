package com.springBasics.spring.basics.springDemo;


import com.springBasics.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springBasics.spring.basics.componentscan")
public class SpringComponentScopeApplication {
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringComponentScopeApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringComponentScopeApplication.class);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		ComponentDAO componentDAO1 = context.getBean(ComponentDAO.class);
		LOGGER.info("{}",componentDAO);
		LOGGER.info("{}",componentDAO.getJdbc());
		LOGGER.info("{}",componentDAO.getJdbc());
		LOGGER.info("{}",componentDAO.getJdbc());
		LOGGER.info("{}",componentDAO1);
		LOGGER.info("{}",componentDAO1.getJdbc());
	}
}
