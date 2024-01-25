package lv1.success.두정수사이의합;

import java.util.stream.LongStream;

class Solution {
  public long solution(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);

    return LongStream.rangeClosed(min, max)
            .reduce(0, (acc, cur) -> acc + cur);
  }
}
