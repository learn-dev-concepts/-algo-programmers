package lv1.나누어떨어지는숫자배열;

import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] defaultArr = {-1};
    int[] sortedArr = Arrays.stream(arr)
            .filter((el) -> el % divisor == 0)
            .sorted()
            .toArray();

    return sortedArr.length == 0 ? defaultArr : sortedArr;
  }
}
