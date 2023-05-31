package com.springBasics.spring.basics.componentscan;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
    @Autowired
    ComponentJDBC jdbc;

    public ComponentJDBC getJdbc() {
        return jdbc;
    }

    public void setJdbc(ComponentJDBC jdbc) {
        this.jdbc = jdbc;
    }
//    @PostConstruct
//    public  void postConstruct(){
//        System.out.println("---PostConstruct---");
//    }
//    @PreDestroy
//    public void preDestroy(){
//        System.out.println("---PreDestroy---");
//    }
}
