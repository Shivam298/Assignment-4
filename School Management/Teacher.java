import java.util.*;
public class Teacher{
    String name;
    ArrayList<Course> courses=new ArrayList<Course>();
    public Teacher(String name){
        this.name=name;
    }
    public void add(Course c){
        courses.add(c);
    }
    public void remove(Course c){
        courses.remove(c);
    }
    public void show(){
        System.out.println("Name :"+name);
        System.out.println("Courses :"+courses);
        
    }
}