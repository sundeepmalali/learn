package com.learn;

import java.util.Arrays;

public class BasicComparator {

    public static void main (String... args) {
        java.util.Comparator<String> cmp = new java.util.Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        String[] names = new String[] {"Sundeep", "malali", "avani", "hello", "is"};
        Arrays.sort (names, cmp);
        for(String name : names) {
            System.out.println(name);
        }
        
    }
}
