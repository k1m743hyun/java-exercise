public class Static {
  public static void main(String[] args) {
    
  }
}

public class Person {

  private String name = "Taehyun Kim";

  public void printName() {
    System.out.println(this.name);
  }
}

public class StaticPerson {

  public static final String name = "Taehyun Kim";

  public static void printName() {
    System.out.println(this.name);
  }
}