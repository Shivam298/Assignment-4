import java.util.*;
public class Four {

    public static void main(String[] args) {
              TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
              map.put(100,"Amit");    //associating specified value with specified key
              map.put(102,"Ravi");    
              map.put(101,"Vijay");    
              map.put(103,"Rahul");    
              System.out.println(map.containsValue("Rhul")); //searching for specific value     
    }
}