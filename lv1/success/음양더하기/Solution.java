package lv1.success.음양더하기;

import java.util.stream.IntStream;

class Solution {
  public int solution(int[] abs, boolean[] signs) {

    return IntStream.range(0, abs.length).map((idx) -> {
      int sign = signs[idx] ? 1 : -1;
      return abs[idx] * sign;
    }).reduce(0, (acc, cur) -> acc + cur);

  }
}
