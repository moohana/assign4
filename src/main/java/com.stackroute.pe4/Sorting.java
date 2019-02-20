//program for sorting string

package com.stackroute.pe4;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Sorting {
    public List<String> sorter(String indata){
        //split  the words
        List<String> S_list = Arrays.asList(indata.split(" +"));
        // sort the string
        Collections.sort(S_list);
        return S_list;

    }

}
