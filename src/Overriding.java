package src;

import java.util.List;
import java.util.Arrays;

class Overriding {
  
  public static void main(String args[]) {
    
    List<Movable> li = Arrays.asList(new Car(), new Airplane(), new Train());
    for (Movable m: li) {
      m.move();
    }
  } 
}

interface Movable {
  void move();
}

class Car implements Movable {

  //@Override
  public void move() {
    System.out.println("도로를 달립니다.");
  }
}

class Airplane implements Movable {

  //@Override
  public void move() {
    System.out.println("하늘을 납니다.");
  }
}

class Train implements Movable {

  //@Override
  public void move() {
    System.out.println("선로를 달립니다.");
  }
}