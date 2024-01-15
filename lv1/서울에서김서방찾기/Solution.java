package lv1.서울에서김서방찾기;

class Solution {
  public String solution(String[] seoul) {
    int idx = 0;

    for (int i = 0; i < seoul.length; i++) {
      boolean isKim = seoul[i].equalsIgnoreCase("kim");
      if (!isKim) continue;
      idx = i;
    }

    return new StringBuilder()
            .append("김서방은 ")
            .append(idx)
            .append("에 있다")
            .toString();
  }
}
