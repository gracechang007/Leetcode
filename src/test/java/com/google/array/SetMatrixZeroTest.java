package com.google.array;

import org.junit.Test;

/**
 * Created by ychang on 8/2/2017.
 */
public class SetMatrixZeroTest {
  @Test
  public void setZeroes() throws Exception {
    // Given
    SetMatrixZero setMatrixZero = new SetMatrixZero();
    int[][] array = new int[][]{{1}};

    // When
    setMatrixZero.setZeroes(array);

    // Then
    System.out.print(array.toString());
  }

}