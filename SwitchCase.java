class SwitchCase {  
  public static void main(String args[]) { 
    int i = 0;

    switch(i) {
      case 0:
      case 1:
      case 2: {
        System.out.println("hello");
          break;
      }
      default: {
        System.out.println("world");
      }
    }
  } 
}
