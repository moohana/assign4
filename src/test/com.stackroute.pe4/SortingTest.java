package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort;

    @Before
    public void setUp() throws Exception {
        sort=new Sorting();
    }

    @After
    public void tearDown() throws Exception {
        sort=null;
    }

    @Test
    public void checksort() {
        assertEquals(Arrays.asList(new String[] {"priya","ragu"}),sort.sorter("ragu priya"));
        assertEquals(Arrays.asList(new String[] {"life","live","queen","size"}),sort.sorter("live life queen size"));
    }
}