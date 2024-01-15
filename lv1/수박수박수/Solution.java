package lv1.수박수박수;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public String solution(int n) {
    String s = "수박";

    boolean isEven = n % 2 == 0;
    int cycle = isEven ? n / 2 : (n + 1) / 2;

    String answer = "";
    for (int i = 0; i < cycle; i++) {
      answer += s;
    }


    if (!isEven) {
      answer = answer.substring(0, answer.length() - 1);
    }

    return answer;
  }
}
