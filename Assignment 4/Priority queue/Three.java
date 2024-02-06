import java.util.*;
public class Three
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		PriorityQueue<String> pq = new PriorityQueue<String>();
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
        // add some colors to the queue
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
        System.out.println("PriorityQueue before "+pq);
        pq1.addAll(pq);//copying all values from PriorityQueue to the other
        System.out.println("PriorityQueue after"+pq1);
	}
}