package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpTest {
    RegularExp re;

    @Before
    public void setUp() throws Exception {
        re=new RegularExp();
    }

    @After
    public void tearDown() throws Exception {
        re=null;
    }

    @Test
    public void finder() {
        assertEquals(true,re.finder("live life queen size","life"));
    }
}