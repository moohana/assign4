package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace re;

    @Before
    public void setUp() throws Exception {
        re=new Replace();
    }


    @After
    public void tearDown() throws Exception {
        re=null;
    }

    @Test
    public void check() {
        assertEquals("faity fry",re.check("daily dry"));
        assertEquals("tove",re.check("love"));
    }
}