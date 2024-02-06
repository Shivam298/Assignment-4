import java.util.*;
public class Three {

    public static void main(String[] args) {
              TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
              TreeMap<Integer,String> newMap=new TreeMap<Integer,String>();
              map.put(100,"Amit");    //associating specified value with specified key
              map.put(102,"Ravi");    
              map.put(101,"Vijay");    
              map.put(103,"Rahul");    
              System.out.println(map.containsKey(102)); //searching for specific key     
    }
}