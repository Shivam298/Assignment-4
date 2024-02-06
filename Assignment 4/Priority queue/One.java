import java.util.*;
public class One
{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
        // add some colors to the queue
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
        // print out the elements of the queue
        System.out.println("Elements of the priority queue: " + pq);
	}
}