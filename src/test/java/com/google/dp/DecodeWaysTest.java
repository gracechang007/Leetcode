package com.google.dp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Created by ychang on 3/9/2017.
 */
public class DecodeWaysTest {
  @Test
  public void numDecodings() throws Exception {
    // Given
    DecodeWays decodeWays = new DecodeWays();

    // When
    int res = decodeWays.numDecodings("101");

    // Then
    assertThat(res, is(1));
  }

}