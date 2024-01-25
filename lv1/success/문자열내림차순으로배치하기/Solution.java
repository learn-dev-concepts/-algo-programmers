package lv1.success.문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
  public String solution(String s) {
    List<String> lower = new ArrayList();
    List<String> upper = new ArrayList();

    String[] split = s.split("");
    for (String ch : split) {
      boolean isLowercase = ch.toLowerCase().equals(ch);
      List<String> store = isLowercase ? lower : upper;
      store.add(ch);
    }

    Stream<String> sortedLower = lower.stream()
            .sorted((s1, s2) -> s2.compareTo(s1));

    Stream<String> sortedUpper = upper.stream()
            .sorted((s1, s2) -> s2.compareTo(s1));

    return Stream.concat(sortedLower, sortedUpper)
            .collect(Collectors.joining(""));
  }
}
