
public class Main
{
	public static void main(String[] args) {
		Guest g=new Guest("Shyam","A123412");
		g.curr++;
		Room r=new Room();
		r.curr++;
		Reservation res=new Reservation();
		res.curr++;
		if(r.curr<11){
		    System.out.println("Room Booked");
		}
		g.bill();
	}
}
