package lv1.fail.예산;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 4:50 - 6:30  메모리 초과 26
class Solution {
  public int solution(int[] d, int budget) {
    List<int[]> answer = new ArrayList<>();
    exec(new int[]{}, d, answer);

    int maxDepts = 0;
    for (int i = 0; i < answer.size(); i++) {
      int[] target = answer.get(i);
      int sum = Arrays.stream(target).reduce(0, (acc, cur) -> acc + cur);
      if (sum <= budget && target.length > maxDepts) {
        maxDepts = target.length;
      }
    }

    return maxDepts;
  }

  public void exec(int[] picked, int[] left, List<int[]> answers) {
    if (picked.length != 0) answers.add(picked);

    for (int i = 0; i < left.length; i++) {
      int[] nextPicked = Arrays.copyOf(picked, picked.length + 1);
      int[] nextLeft = Arrays.copyOfRange(left, i + 1, left.length);

      nextPicked[nextPicked.length - 1] = left[i];
      exec(nextPicked, nextLeft, answers);
    }
  }
}
