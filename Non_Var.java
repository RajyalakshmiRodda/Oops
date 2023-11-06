class Compan{
  String name="raji";
  int id=5;
  void display(){
    System.out.println(name);
    System.out.println(id);
  }
}
public class Non_Var{
  public static void main(String[] args){
    System.out.println("access non static variable");
    Compan c=new Compan();
    c.display();
  }
}
