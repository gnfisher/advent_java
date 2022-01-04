package com.gnfisher.app;

public class ReverseString {

  String input;

  public ReverseString(String str) {
    input = str;
  }

  public void run() {
    int start = 0;
    int end = input.length() - 1;
    char[] inputAsArray = input.toCharArray();
    char[] resultArray = new char[input.length()];

    while (start <= end) {
      resultArray[start] = inputAsArray[end];
      resultArray[end] = inputAsArray[start];
      start++;
      end--;
    }

    System.out.println(new String(resultArray));
  }

}
