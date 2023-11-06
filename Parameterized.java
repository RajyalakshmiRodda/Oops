class Student{
    String name;
        int id;
        
    Student( String a,int n)   //parameterized
  {
        name=a;
          id=n;
        
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        
    }
}
public class Parameterized{
    public static void main(String[] args){
        Student s=new Student("raji",4);
        s.display();
    }
}