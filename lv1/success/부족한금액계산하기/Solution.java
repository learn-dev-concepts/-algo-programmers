package lv1.success.부족한금액계산하기;

import java.util.stream.LongStream;

class Solution {
  public long solution(int price, int money, int count) {
    long ttl = LongStream.rangeClosed(1, count)
            .map((i) -> i * price)
            .reduce(0, (acc, cur) -> acc + cur);

    long change = ttl - money;
    if (change <= 0) return 0;
    return change;
  }
}
