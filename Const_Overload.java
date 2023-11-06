class Stu{
    String name;
        int id;
  int age;
    Stu( String a,int n,int i){   //parameterized 
        name=a;
          id=n;
        age=i;
    }
  Stu(int b,int c){
    id=b;
    age=c;
  }
    void display(){
        System.out.println(name);
        System.out.println(id);
     System.out.println(age);
        
    }
}
public class Const_Overload{
    public static void main(String[] args){
        Stu s=new Stu("raji",4,21);
        s.display();
      System.out.println();
      Stu s1=new Stu(5,21);
      s1.display();
    }
}