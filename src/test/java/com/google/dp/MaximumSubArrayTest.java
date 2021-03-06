package com.google.dp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Created by ychang on 3/7/2017.
 */
public class MaximumSubArrayTest {
  @Test
  public void maxSubArray() throws Exception {
    // Given
    MaximumSubArray maximumSubArray = new MaximumSubArray();
    int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

    // When
    int res = maximumSubArray.maxSubArray_DivideConquer(array);

    // Then
    assertThat(res, is(6));

  }

}