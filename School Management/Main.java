
public class Main
{
	public static void main(String[] args) {
		Student rahul=new Student("Rahul","M","12333",16);
		Course c=new Course("Maths",45);
		Course c1=new Course("Science",50);
		rahul.addCourse(c);
		rahul.addCourse(c1);
		rahul.display();
		Teacher t1=new Teacher("Ramesh");
		t1.add(c);
		t1.add(c1);
		t1.show();
	}
}
