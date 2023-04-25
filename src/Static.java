package src;

public class Static {
  
  public static void main(String[] args) {
    
    Person person1 = new Person();
    Person person2 = new Person();

    System.out.println(person1.getName());
    System.out.println(person2.getName());
  }
}

public class Person {

  //private String name = "Taehyun Kim";
  private static String name = "Hyuntae Kim";

  public String getName() {
    return this.name;
  }
}