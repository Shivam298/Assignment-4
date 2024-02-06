import java.util.*;
public class Four
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		PriorityQueue<String> pq = new PriorityQueue<String>();
        // add some colors to the queue
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
        String input;
        System.out.println("Enter value to insert in PriorityQueue");//asking user to enter value to add in pq
        input=in.nextLine();//adding enterd value to pq
        pq.add(input);
        // print out the elements of the queue with Iterator
        Iterator<String> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
	}
}