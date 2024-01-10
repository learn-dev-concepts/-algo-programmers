package lv1.자연수뒤집어배열로만들기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public int[] solution(int n) {
    int[] res = solution3(n);

    return res;
  }

  private int[] solution3 (int n) {
    return new StringBuilder(String.valueOf(n))
            .reverse()
            .toString()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
  }

  private int[] solution2 (int n) {
     int[] list = Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::valueOf).toArray();

     for (int i = 0; i < list.length / 2; i++) {
        int temp = list[i];
        list[i] = list[list.length - 1 - i];
        list[list.length - 1 - i] = temp;
     }

     return list;
  }

  private int[] solution1 (int n) {
    List<Integer> list = Arrays.stream(String.valueOf(n).split(""))
            .map(Integer::valueOf)
            .collect(Collectors.toList());

    Collections.reverse(list);
    int[] arr = list.stream().mapToInt((i) -> i).toArray();
    return arr;
  }
}
