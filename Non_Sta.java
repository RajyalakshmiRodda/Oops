class Comp{
  void display(){
    System.out.println("hello java");
  }
}
public class Non_Sta{
  public static void main(String[] args){
    System.out.println("access non static variable");
    Comp c=new Comp();
    c.display();
  }
}
