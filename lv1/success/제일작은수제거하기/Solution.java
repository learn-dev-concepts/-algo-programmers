package lv1.success.제일작은수제거하기;

import java.util.Arrays;


class Solution {
  public int[] solution(int[] arr) {
    int min = Arrays.stream(arr)
            .sorted()
            .findFirst()
            .orElse(0);

    int[] result = Arrays.stream(arr)
            .filter((i) -> i != min)
            .toArray();

    return result.length == 0 ? new int[]{-1} : result;

  }
}
