import java.util.*;
class CustomData implements Comparator<Integer> {
  @Override
  public int compare(Integer n1, Integer n2) {
    return n2-n1;
  }
}
public class Compare {
  public static void main(String[] args) {
    PriorityQueue<Integer>c=new PriorityQueue<Integer>(new CustomData());
    c.add(10);
    c.add(15);
    c.add(20);
    c.add(25);
    c.add(30);
    System.out.println(c);
  }
}