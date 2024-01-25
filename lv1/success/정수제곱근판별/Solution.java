package lv1.success.정수제곱근판별;


class Solution {
  public long solution(long n) {
    double rooted = Math.sqrt(n);
    double floored = Math.floor(rooted);

    if (rooted == floored) {
      return (long) Math.pow(rooted + 1, 2);
    }
    return -1;
  }
}
