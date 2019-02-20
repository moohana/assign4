package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose ts;

    @Before
    public void setUp() throws Exception {
        ts=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        ts=null;
    }

    @Test
    public void checktranspose() {

        assertEquals("elppa",ts.transposer("apple"));
        assertEquals("evil efil neeuq ezis",ts.transposer("live life queen size"));


    }
}