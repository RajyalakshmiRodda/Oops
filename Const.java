class Summer{
   void sary(){
        System.out.println("hello java");
    }
  void salry(){
    sary();
        System.out.println("welcome to java");      
    }
}
public class Const{
    public static void main(String[] args){
        Summer s=new Summer();
        s.salry();
    }
}