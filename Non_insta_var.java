class Company{
  String ename="raji";
  int eid=1;
  double esal=5000;
}
public class Non_insta_var{
  public static void main(String[] args){
    System.out.println("access non static variable");
    Company c=new Company();
    System.out.println(c.ename);
     System.out.println(c.eid);
     System.out.println(c.esal);
  }
}