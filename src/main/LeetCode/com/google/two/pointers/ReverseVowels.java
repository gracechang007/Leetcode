package com.google.two.pointers;

/**
 * Created by ychang on 12/19/2016.
 */
public class ReverseVowels {

  public String reverseVowels(String s) {
    int start = 0, e = s.length() - 1;
    String vowel = "aeiouAEIOU";
    StringBuilder sb = new StringBuilder(s);
    while (start<e) {
      /*
        remember use while instead of if
       */
      while (start<e && vowel.indexOf(s.charAt(start))<0)
        start++;
      while (start<e && vowel.indexOf(s.charAt(e))<0)
        e--;
      /*
        after the 2 previous while, must still check start<e, because only when start<e, we need switch
       */
      if (start<e) {
        char temp = s.charAt(e);
        /*
        StringBuilder has a method setCharAt(index, char) which can set a char in a specific position
         */
        sb.setCharAt(e, s.charAt(start));
        sb.setCharAt(start, temp);
        start++;
        e--;
      }
    }
    return sb.toString();
  }

}


