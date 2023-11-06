class College{
  String n="lucky";
  int rno=56;
  static String name="raji";
  static int i=15;
  void display(){
    System.out.println(n);
    System.out.println(rno);
    System.out.println(name);    
  }
}
public class Clg{
  public static void main(String[] args){
    College c=new College();
    c.display();
    System.out.println(College.i);
  }
}