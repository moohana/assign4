package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharTest {
    CountChar cc;

    @Before
    public void setUp() throws Exception {
        cc=new CountChar();
    }


    @After
    public void tearDown() throws Exception {
        cc=null;
    }

    @Test
    public void check() {
       assertEquals(2,cc.check("mohana",'a'));
        assertEquals(4,cc.check("JAVA AGAIN",'a'));
        assertEquals(3,cc.check("mohana PRIYA",'a'));
    }
}