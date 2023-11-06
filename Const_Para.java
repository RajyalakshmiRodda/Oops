class Employee{
        int id;
  String name;
  int age;
  int salary;
  
  Employee(){
    id=2;
    name="raji";
    age=20;
    salary=20000;
    
  }     
    Employee(int a,String b,int c,int d){
         id=a;
      name=b;
      age=c;
      salary=d;    
    }
  
    void display(){
      System.out.println(id);
        System.out.println(name);
      System.out.println(age);
      System.out.println(salary);        
    }
}
public class Const_Para{
    public static void main(String[] args){
        Employee s=new Employee(3,"raji",21,10000);
     Employee s1=new Employee();
        s.display();
      System.out.println();
      s1.display();
    } 
}