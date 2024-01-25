package lv1.success.핸드폰번호가리기;



class Solution {
  public String solution(String phone_number) {
    StringBuilder answer = new StringBuilder();
    String[] arr = phone_number.split("");

    for (int i = 0; i < arr.length; i++) {
      boolean shouldShow = i >= arr.length - 4;
      String el = shouldShow ? arr[i] : "*";
      answer.append(el);
    }

    return answer.toString();

  }
}
