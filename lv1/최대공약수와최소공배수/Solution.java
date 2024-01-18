package lv1.최대공약수와최소공배수;


import java.util.HashSet;
import java.util.Set;

class Solution {
  public int[] solution(int n, int m) {
    int minNum = Math.min(n, m);
    int maxNum = Math.max(n, m);

    //최대공약수
    int GCD = 0;
    for (int i = 1; i <= minNum; i++) {
      if (minNum % i == 0 && maxNum % i == 0) {
        GCD = i;
      }
    }

    // 최소 공배수

    int LCM = 0;

    int j = 1;
    Set<Integer> multiples = new HashSet<>();
    while(true) {
      int minMultiple = minNum * j;
      int maxMultiple = maxNum * j;

      if (multiples.contains(minMultiple)) {
        LCM = minMultiple;
        break;
      }

      if (multiples.contains(maxMultiple)) {
        LCM = maxMultiple;
        break;
      }

      multiples.add(minMultiple);
      multiples.add(maxMultiple);
      j++;
    }


    int[] result = new int[] { GCD, LCM };
    return result;
  }
}
