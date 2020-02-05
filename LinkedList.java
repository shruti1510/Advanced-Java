import java.util.LinkedList;
public class linkedlist 
{
	public static void main(String[] args)
	{
       LinkedList<Integer> l=new LinkedList<Integer>();
       l.add(10);
       l.add(20);
       l.add(30);
       System.out.println(l);
      //1.addFirst
       l.addFirst(33);
       System.out.println(l);
       
       //2.addLast
       l.addLast(40);
       System.out.println(l);
       
       //3.getFirst
       System.out.println(l.getFirst());
       
       //4.getLast
       System.out.println(l.getLast());
       
       //5.removeFirst
       System.out.println(l.removeFirst());
       
       //6.removeLast
       System.out.println(l.removeLast());
	}
}
