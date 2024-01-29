package lv1.success.크기가작은부분문자열;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int solution(String t, String p) {
    List<String> candidates = new ArrayList<>();

    for (int i = 0; i < t.length() - p.length() + 1; i++) {
      String target = t.substring(i, i + p.length());
      boolean isProper = Integer.parseInt(target) <= Integer.parseInt(p);
      if (isProper) candidates.add(target);
    }

    return candidates.size();
  }
}
