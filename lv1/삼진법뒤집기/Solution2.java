package lv1.삼진법뒤집기;


import java.util.stream.IntStream;

class NumberSystem {

  public static String base3(int n, String r) {
    int quotient = (int) n / 3;
    int remainder = n % 3;

    if (quotient == 0) return remainder + r;
    return base3(quotient,  remainder + r);
  }
  public static int base10(String n) {
    String[] split = n.split("");
    int len = split.length;

    return IntStream.rangeClosed(0, len - 1).reduce(0, (acc, cur) -> {
      int num = Integer.parseInt(split[cur]);
      acc += Math.pow(3, cur) * num;
      return acc;
    });
  }
}

class Solution2 {
  public int solution(int n) {
    String base3 = NumberSystem.base3(n, "");
    int base10 = NumberSystem.base10(base3);

    return base10;
  }
}
