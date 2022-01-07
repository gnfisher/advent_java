package com.gnfisher.app;

public class ReverseString {
    String input;
    int length;

    public ReverseString(String str) {
        input = str;
        length = str.length();
    }

    public void run() {

        System.out.println(reverse());
    }

    public String reverse() {
        char[] inputAsArray = input.toCharArray();
        char[] resultArray = new char[length];

        int end = length - 1;
        int start = 0;
        while (start <= end) {
            resultArray[start] = inputAsArray[end];
            resultArray[end] = inputAsArray[start];
            start++;
            end--;
        }
        return new String(resultArray);
    }
}
