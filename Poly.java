class Animal1 {
  void bark() {
    System.out.println("barking");
  }
}
class Dog1 extends Animal1 {
  void bark() {
    super.bark();
    System.out.println("dog barking bow bow");
  }
}
class Lion extends Dog1 {
  void bark() {
    super.bark();
    System.out.println("lion is barking");
  }
}
public class Poly {
  public static void main(String[] args) {
    Lion l=new Lion();
    l.bark();
  }
}