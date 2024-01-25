package lv1.이상한문자만들기;


public class App {
  private static String input = "try hello  world ";
  public static void main(String[] args) {
    String[] a = input.split(" ");
    String[] b = (input.split(" ", -1));

    System.out.println(new Solution().solution(input));
  }
}
