import java.util.*;
class InsufficientFund extends Exception{
    String fund;
    InsufficientFund(String fund){
        super(fund);
        this.fund=fund;
    }
}
public class InsufFund {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		String fund=sc.next();
		try {
		    if(fund!="10000") {
		        throw new InsufficientFund("insufficient amount");
		          }
		}
		catch(InsufficientFund e) {
		    System.out.println(e.getMessage());
		}
	}
}
