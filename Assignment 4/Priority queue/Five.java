import java.util.*;
public class Five
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		PriorityQueue<String> pq = new PriorityQueue<String>();
        // add some colors to the queue
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
        System.out.println("PriorityQueue before "+pq);
        pq.clear();//clearing all values from PriorityQueue
        System.out.println("PriorityQueue after"+pq);
	}
}