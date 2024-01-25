package lv1.success.이상한문자만들기;
class Solution {
  public String solution(String s) {
   String[] arr = s.split("");
   StringBuilder b = new StringBuilder("");

   int pointer = 0;
   for (int i = 0; i < arr.length; i++) {
      b.append(pointer % 2 == 0 ? arr[i].toUpperCase() : arr[i].toLowerCase());
      pointer = arr[i].equals(" ") ? 0 : pointer + 1;
   }

   return b.toString();
  }

  public String solution1(String s) {
    char[] chs = s.toCharArray();
    String answer = "";

    int pointer = 0;
    for (int i = 0; i < chs.length; i++) {
      String ch = chs[i] + "";

      if (ch.equals(" ")) {
        pointer = 0;
        answer += " ";
        continue;
      }

      String converted = pointer % 2 == 0 ? ch.toUpperCase() : ch.toLowerCase();
      answer += converted;
      pointer++;
    }

    return answer;
  }
}

