package lv1.자릿수더하기;

import java.util.Optional;
import java.util.Arrays;

class Solution {
  public int solution(int n) {
    String[] chars = String.valueOf(n).split("");
    Optional<Integer> res = Arrays.stream(chars)
            .map((ch) -> Integer.parseInt(ch))
            .reduce((acc, cur) -> acc +cur);

    return res.orElse(0);
  }
}
