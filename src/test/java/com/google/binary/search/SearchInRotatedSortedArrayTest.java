package com.google.binary.search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

/**
 * Created by ychang on 1/25/2017.
 */
public class SearchInRotatedSortedArrayTest {
  SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();

  @Test
  public void search_rotatedIndex() throws Exception {
    // Given
    int[] array = new int[]{3, 1};

    // When
    int res = sirsa.search_rotatedIndex(array, 3);

    assertThat(res, is(0));

  }

}