import java.util.*;
public class Two
{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
        // add some colors to the queue
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
        // print out the elements of the queue with Iterator
        Iterator<String> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
	}
}