package src;

import java.util.StringTokenizer;

class Split {

  public static void main(String[] args) {
    String[] arr = new String[]{"", "/", "a/", "/b", "a/b"};
    for (String s : arr) {
      // 공백 제거
      System.out.println(s.split("/").length);

      // 공백 유지
      System.out.println(s.split("/", -1).length);
      System.out.println("-----");
    }
  }
}