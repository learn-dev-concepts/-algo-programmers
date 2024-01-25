package lv1.success.최대공약수와최소공배수;



class Euclidean {

  public static int[] exec(int n , int m) {
    int minNum = Math.min(n, m);
    int maxNum = Math.max(n, m);

    int[] answer = new int[2];

    answer[0] = gcd(maxNum, minNum);
    answer[1] = (n * m) / answer[0];

    return answer;
  }

  public static int gcd(int n, int m) {
    if (m == 0) return n;
    return gcd(m, n % m);
  }
}

class Solution2 {
  public int[] solution(int n, int m) {
    return Euclidean.exec(n, m);
  }
}