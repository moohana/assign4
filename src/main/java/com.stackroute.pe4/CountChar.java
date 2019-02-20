//Write a java program to count the total number of occurrences of a given character in a string
//without using any loop?

package com.stackroute.pe4;

public class CountChar {
    public int check(String string,char ch){
        string=string.toLowerCase();
        String character=Character.toString(ch);
        character=character.toLowerCase();
        int length=string.length();
        int sublength=string.replace(character ,"").length();
        int count=length-sublength;
        return count;





    }
}

