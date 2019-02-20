package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurTest {
    MultipleOccur mul;

    @Before
    public void setUp() throws Exception {
        mul=new MultipleOccur();
    }


    @After
    public void tearDown() throws Exception {
        mul=null;
    }

    @Test
    public void checkoccur() {
        assertEquals("Found at:0-2",mul.checkoccur("apple","ap"));
        assertEquals("Found at:3-5 Found at:7-9 Found at:10-12",mul.checkoccur("mohana an an","an"));
    }
}