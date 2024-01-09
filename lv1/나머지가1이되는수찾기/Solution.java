package lv1.나머지가1이되는수찾기;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public int solution(int n) {
    OptionalInt sum = IntStream.rangeClosed(1, n).reduce((acc, cur) ->
            n % cur == 0 ? acc + cur : acc
    );

    return sum.orElse(0);
  }
}
