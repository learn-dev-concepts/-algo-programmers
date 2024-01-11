package lv1.정수내림차순으로배치하기;

import java.util.Arrays;

class Solution {
  public long solution(long n) {

    String res = Arrays.stream(String.valueOf(n).split(""))
            .sorted((n1, n2) -> Integer.compare(Integer.parseInt(n2), Integer.parseInt(n1)))
            .reduce("", (acc, cur) -> acc + cur);

    return Long.parseLong(res);
  }
}
