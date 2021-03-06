package com.google.heap;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ychang on 3/14/2017.
 */
public class SlidingWindowMax {
  /**
   * this one beat 98%
   */
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (k<=1 || nums.length==0)
      return nums;
    int[] res = new int[nums.length - k + 1];
    int max = 0, z = 0, i = 1;
    for (; i<k; i++) {
      if (nums[i]>=nums[max]) {
        max = i;
      }
    }
    res[z++] = nums[max];
    for (; i<nums.length; i++) {
      if (nums[i]>=nums[max])
        max = i;
      if (i - max>=k) {
        int j = max + 1;
        max = i;
        for (; j<i; j++) {
          if (nums[j]>nums[max])
            max = j;
        }
      }
      res[z++] = nums[max];
    }
    return res;
  }

  /**
   * this can beat 39%, but this is O(n)
   */
  public int[] maxSlidingWindow_Deque(int[] nums, int k) {
    if (nums.length<=1) return nums;
    int left=0, right=0, z=0;
    int[] res = new int[nums.length-k+1];
    Deque<Integer> queue = new LinkedList();
    while (right<nums.length) {
      // first remove all out of range index in queue, the header is the earliest
      while(!queue.isEmpty()&&queue.peekFirst()<left)
        queue.pollFirst();
      // second remove all index which value < cur value and before cur because we will not use it
      while (!queue.isEmpty()&&nums[queue.peekLast()]<=nums[right])
        queue.pollLast();
      // third add value to queue
      queue.offer(right++);
      // left the window left edge, when window extends to k-len, begin to increment left each time
      if (right-left==k) {
        res[z++]=nums[queue.peek()];
        left++;
      }
    }
    return res;
  }

}
