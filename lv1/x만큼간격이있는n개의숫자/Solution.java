package lv1.x만큼간격이있는n개의숫자;

import java.util.stream.LongStream;

class Solution {
  public long[] solution(int x, int n) {
    return LongStream
            .rangeClosed(1, n).map((i) -> i * x)
            .toArray();
  }
}
