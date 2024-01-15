package lv1.내적;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public int solution(int[] a, int[] b) {
    int[] multiplied = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      multiplied[i] = a[i] * b[i];
    }

    return Arrays.stream(multiplied)
            .reduce(0, (acc, cur) -> acc + cur);



  }
}
