package com.courses.idea;

public class DataStatementsTwelwe {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean str1 = str.contains("Java");
        boolean str2 = str.startsWith("I like");
        boolean str3 = str.endsWith("!!!");

        if (str1 && str2 && str3) {
            System.out.println(str.toUpperCase());
        }

        String substr = str.replace('a','o');
        System.out.println(substr.substring(substr.indexOf("J"),substr.length()-3));

    }
}
