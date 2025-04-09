package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(toUpperCase(reverseString("Hello, World!")));
        System.out.println(toLowerCase(reverseString("Hello, World!")));
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

    /**
     * Converts the given string to uppercase
     * @param str the string to be converted
     * @return the uppercase string
     */
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

        /**
     * Converts the given string to lower case
     * @param str the string to be converted
     * @return the lower case string
     */
    public static String toLowerCase(String str){
        return str.toLowerCase();
    }

    public static int length(String str){
        return str.length();
    }
}