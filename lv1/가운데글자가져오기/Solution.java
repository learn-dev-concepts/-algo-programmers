package lv1.가운데글자가져오기;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
  public String solution(String s) {
    int[] center = getTargetIdx(s.length());
    String[] arr = s.split("");

    StringBuilder b = new StringBuilder();

    for (int i = 0; i < center.length; i++) {
      b.append(arr[center[i]]);
    }

    return b.toString();
  }

  private int[] getTargetIdx(int len) {
    boolean isEven = len % 2 == 0;
    int center = (int) Math.floor(len / 2);

    return isEven
            ? new int[]{center - 1, center}
            : new int[]{center};
  }
}
