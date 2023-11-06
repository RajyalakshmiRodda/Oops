class Ani{
  void walk(){
    System.out.println("walking");
  }
}
class cat extends Ani{
  void sound(){
    System.out.println("cat is making noise");
  }
}
class babycat extends cat{
  void sleep(){
    System.out.println("babycat is sleeping");
  }
}
public class Multilevel_Inhe{
  public static void main(String[] args){
    babycat b=new babycat();
    b.walk();
    b.sound();
    b.sleep();
  }
}