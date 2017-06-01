package com.google.bit.manipulation;

/**
 * Created by ychang on 3/28/2017.
 * Given two strings s and t which consist of only lowercase letters. String t is generated by random shuffling string s
 * and then add one more letter at a random position. Find the letter that was added in t.
 */
public class FindDifference {
  /**
   * this can beat 77%. the idea is 1) char is int so can be presented be bits. 2) a int XOR itself should be 0.
   */
  public char findTheDifference(String s, String t) {
    int len=s.length();
    char c = t.charAt(len);
    for (int i=0; i<len; i++) {
      c^=s.charAt(i);
      c^=t.charAt(i);
    }
    return c;
  }
}