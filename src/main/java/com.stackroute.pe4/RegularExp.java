//program for regular expression

package com.stackroute.pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExp {

    public boolean finder(String indata,String find)
    {
        return Pattern.compile(find).matcher(indata).find();
    }
}
