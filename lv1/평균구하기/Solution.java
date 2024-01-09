package lv1.평균구하기;

import java.util.OptionalInt;
import java.util.Arrays;

class Solution {
  public Double solution(int[] arr) {
    OptionalInt _sum = Arrays.stream(arr).reduce((a, c) -> a + c);
    double sum = (double) _sum.orElse(0);

    return  (sum / arr.length);
  }
}
