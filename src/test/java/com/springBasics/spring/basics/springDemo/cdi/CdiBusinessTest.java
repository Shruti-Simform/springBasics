package com.springBasics.spring.basics.springDemo.cdi;

import com.springBasics.spring.basics.springDemo.SpringCdiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringCdiApplication.class)
public class CdiBusinessTest {
    @Autowired
    CdiBusiness cdiBusiness;
    @Test
    public void testCdi(){
        int res = cdiBusiness.findGreatest();
        assertEquals(7,res);
    }

}