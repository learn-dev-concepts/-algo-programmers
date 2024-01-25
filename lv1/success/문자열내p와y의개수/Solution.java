package lv1.success.문자열내p와y의개수;

import java.util.Arrays;
import java.util.Optional;

class Solution {
  public boolean solution(String n) {

    int res = n.chars().reduce(0, (acc, cur) -> {
      if (cur == 'p' || cur == 'P') {
        return acc + 1;
      } else if (cur == 'y' || cur == 'Y') {
        return acc - 1;
      } else {
        return acc;
      }
    });

    return res == 0;
  }

  public boolean solution1(String n) {
    int count = 0;
    String[] arr = n.split("");

    for (String el: arr) {
      if (el.equalsIgnoreCase("p")) {
        count++;
      } else if (el.equalsIgnoreCase("y")) {
        count--;
      }
    }

    return count == 0;
  }
}
