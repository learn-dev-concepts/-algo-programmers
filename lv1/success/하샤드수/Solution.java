package lv1.success.하샤드수;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public boolean solution(int n) {
    int factor = String.valueOf(n).chars()
            .map(Character::getNumericValue)
            .reduce(0, (acc, cur) -> acc + cur);

    return n % factor == 0;
  }
}
