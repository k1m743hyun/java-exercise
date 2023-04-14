package src;

class Split {

  public static void main(String[] args) {
    String[] arr = new String[]{"", "/", "a/", "/b", "a/b", "a/b/c", "a/b/c/", "a/b/c/d"};
    for (String s : arr) {
      System.out.println(s);
      
      // 공백 제거
      System.out.println(s.split("/").length);

      System.out.println(s.split("/", 0).length);

      // 공백 유지
      System.out.println(s.split("/", -1).length);
      
      System.out.println(s.split("/", -2).length);
      System.out.println("-----");
    }
  }
}