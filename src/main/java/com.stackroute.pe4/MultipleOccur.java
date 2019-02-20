//program for checking multiple occurence in a string

package com.stackroute.pe4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MultipleOccur {
    public String checkoccur(String indata, String c_in){
        String out="";
        Pattern p=Pattern.compile(c_in);
        Matcher m=p.matcher(indata);
        while(m.find()){

            out+= "Found at:"+m.start()  + "-"+ m.end() +  " ";

        }
        return out.trim();


    }
}
