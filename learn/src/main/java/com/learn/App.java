package com.learn;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Comparator<String> cmp = (s1, s2) -> {
            System.out.println("Comparing string lengths");
            return s1.length() - s2.length();
        };

        Comparator<String> cmp1 = (s1, s2) -> s1.length() - s2.length();
        Arrays.sort(new String[] {"sundeep", "malali"}, cmp1);
    }
}
