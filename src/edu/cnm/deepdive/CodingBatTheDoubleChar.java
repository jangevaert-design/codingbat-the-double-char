package edu.cnm.deepdive;

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

class CodingBatTheDoubleChar {

  public static void main(String[] args) {

    System.out.printf("For the String %s, the result will be: " + doubleChar("The") + ".\n", "The");
    System.out.printf("For the String %s, the result will be: " + doubleChar("AAbb") + ".\n", "AAbb");
    System.out.printf("For the String %s, the result will be: " + doubleChar("Hi-There") + ".\n", "Hi-There");
  }

  public static String doubleChar(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      result = result + str.charAt(i) + str.charAt(i);
    }
    return result;
  }

}
