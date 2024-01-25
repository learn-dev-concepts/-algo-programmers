package lv1.success.약수의개수와덧셈;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public int solution(int left, int right) {
    return IntStream.rangeClosed(left, right)
            .map((i) -> i * getPulse(i))
            .reduce(0, (acc, cur) -> acc + cur);
  }

  private int getPulse(int num) {
    int count = (int) IntStream.rangeClosed(1, num)
            .filter((i) -> num % i == 0)
            .count();

    return count % 2 == 0 ? 1 : -1;
  }
}
