package com.springBasics.spring.basics.springDemo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class CdiBusiness {
    @Autowired
    CdiDAO cdiDAO;

    public CdiDAO getCdiDAO() {
        return cdiDAO;
    }

    public void setCdiDAO(CdiDAO cdiDAO) {
        this.cdiDAO = cdiDAO;
    }
    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = cdiDAO.getData();
        for(int value : data){
            if(greatest < value)
                greatest = value;
        }
        return greatest;
    }
}
