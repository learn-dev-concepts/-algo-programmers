package lv1.success.나머지가1이되는수찾기;
class Solution {
  public int solution(int n) {
    int count = 1;

    while (true) {
      if (n % count == 1) break;
      count++;
    }

    return count;
  }
}