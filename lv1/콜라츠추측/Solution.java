package lv1.콜라츠추측;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public int solution(int n) {
    if (n == 1) return 0;

    int answer = -1;
    double next = n;

    for (int i = 0; i < 500; i++) {
      double collatz = doCollatz(next);

      if (collatz == 1) {
        answer = i + 1;
        break;
      }

      next = collatz;
    }

    return answer;
  }

  private double doCollatz(double n) {
    boolean isEven = n % 2 == 0;
    return isEven ? n / 2 : (n * 3) + 1;
  }
}
