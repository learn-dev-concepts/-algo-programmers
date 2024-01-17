package lv1.행렬의덧셈;


public class App {
  private static int[][] input1 = {{1,2}, {2,3}};
  private static int[][] input2 = {{3,4}, {5,6}};
  public static void main(String[] args) {
    System.out.println(new Solution().solution(input1, input2));
  }
}
