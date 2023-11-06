abstract class Bank1 {
  abstract void pin();
  void interest() {
    System.out.println("the interest is 5%");
  }
}
class Pnb extends Bank1 {
  void pin() {
    System.out.println("enter the pin");
  }
}
public class Bank {
  public static void main(String[] args) {
    Pnb p=new Pnb();
    p.pin();
    p.interest();
  }
}