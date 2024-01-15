package lv1.없는숫자더하기;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Set;

class Solution {
  public int solution(int[] numbers) {
    Set<Integer> nums = IntStream.rangeClosed(0, 9)
            .mapToObj((i) -> i)
            .collect(Collectors.toSet());

    for (int el : numbers) {
      nums.remove(el);
    }

    return nums.stream().reduce(0, (acc, cur) -> acc + cur);

  }
}
