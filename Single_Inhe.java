 class Animals{
  void eat(){
    System.out.println("eating");
  }
}
class rabbit extends Animals{
  void sleep(){
    System.out.println("rabbit is sleeping");
  }
}
public class Single_Inhe{
  public static void main(String[] args){
    rabbit r=new rabbit();
    r.sleep();
    r.eat();
  }
}