package com.google.string;

/**
 * Created by ychang on 4/26/2017.
 * The read4 API is defined in the parent class Reader4.
 * int read4(char[] buf);
  Think that you have 4 chars "a, b, c, d" in the file, and you want to call your function twice like this:
  read(buf, 1); // should return 'a'
  read(buf, 3); // should return 'b, c, d'
  All the 4 chars will be consumed in the first call. So the tricky part of this question is how can you preserve the remaining 'b, c, d' to the second call.
 */
public class ReadNCharGivenRead4IIMultipleTimes {
  char[] cache = new char[4];
  int num=0, ptr=0;

  /**
   * @param buf Destination buffer
   * @param n   Maximum number of characters to read
   * @return The number of characters read
   */
  public int read(char[] buf, int n) {
    int total=0;
    while (total<n) {
      // num==0 means there is no leftover from prev read
      if (num==0) num=read4(cache);
      // num==0 means there is no char read from file to cache, so terminate
      if (num==0) break;
      // if not from prev read, ptr is 0, otherwise from prev left position
      int i=ptr;
      // max value of num is 4
      for (; i<num && total<n; i++) buf[total++]=cache[i];
      if (i==num) { // have read all chars from cache, reset num and ptr
        num=0; ptr=0;
      } else { // in this case, total==n, save current position to ptr for next call of method read
        ptr=i;
      }
    }
    return total;
  }

  private int read4(char[] cache) {
    char[] temp = new char[]{'a', 'b', 'c', 'd'};
    cache = temp;
    int res = 4;
    return res;
  }
}
