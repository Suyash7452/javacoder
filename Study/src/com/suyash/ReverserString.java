package com.suyash;

public class ReverserString {
    public static void main(String[] args) {
        //Leetcode program number 151. Reverse Words in a String
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        String[] arr=s.trim().split(" ");
        String reverseString="";
        for(String s1:arr){
            reverseString=s1+" "+reverseString;
            reverseString=reverseString.trim();
        }

        return reverseString;
    }
}
