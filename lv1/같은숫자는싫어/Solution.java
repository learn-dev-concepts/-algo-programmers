package lv1.같은숫자는싫어;

import java.util.Stack;

class Solution {
  public int[] solution(int[] n) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n.length; i++) {
      int cur = n[i];

      if (stack.size() > 0 && stack.peek() == cur) continue;
      stack.push(cur);
    }

    return stack.stream().mapToInt(Integer::intValue).toArray();
  }
}
