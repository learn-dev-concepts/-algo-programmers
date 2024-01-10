package lv1.짝수와홀수;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public String solution(int n) {
    boolean isEven = n % 2 == 0;
    return isEven ? "Even" : "Odd";
  }
}
