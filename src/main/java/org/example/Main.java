package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello, World!"));
    }

    /**
     * Reverses the given string
     * @param str the string to be reversed
     * @return the reversed string
     */
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}