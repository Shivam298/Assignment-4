import java.util.*;
public class Student{
    String name,gender,contact;
    int age;
    ArrayList<Course> list=new ArrayList<Course>();
    public Student(String name,String gender,String contact,int age){
        this.name=name;
        this.gender=gender;
        this.contact=contact;
        this.age=age;
    }
    public void change(String contact){
        this.contact=contact;
    }
    public void addCourse(Course c){
        list.add(c);
    }
    public void removeCourse(Course c){
        list.remove(c);
    }
    public void display(){
        System.out.println("Name :"+name+" Age :"+age+" Gender :"+gender+" Contact :"+contact);
        System.out.println("Courses :"+list);
    }
}