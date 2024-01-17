package lv1.행렬의덧셈;

class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int outerLength = arr1.length;
    int innerLength = arr1[0].length;

    int[][] answer = new int[outerLength][innerLength];

    for (int i = 0; i < outerLength; i++) {
      for (int j = 0; j < innerLength; j++) {
        answer[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    return answer;
  }
}