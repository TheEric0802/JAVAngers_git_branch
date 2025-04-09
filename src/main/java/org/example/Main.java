package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(toUpperCase(reverseString("Hello, World!")));
        System.out.println(toLowerCase(reverseString("Hello, World!")));
        System.out.println(length("Hello, World!"));
        System.out.println(reverseCase("Hello, World!"));
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

    /**
     * Gets the length of a given string
     * @param str the string to find the length of
     * @return the length of the string
     */
    public static int length(String str){
        return str.length();
    }

    /**
     * Reverses the case of each character in the given string
     * @param str the string whose case is to be reversed
     * @return the string with reversed case
     */
    public static String reverseCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}