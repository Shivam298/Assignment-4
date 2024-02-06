import java.util.*;
public class One {

    public static void main(String[] args) {
              TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
              map.put(100,"Amit");    //associating specified value with specified key
              map.put(102,"Ravi");    
              map.put(101,"Vijay");    
              map.put(103,"Rahul");    
                
              for(Map.Entry m:map.entrySet()){ //displaying key value pairs   
               System.out.println(m.getKey()+" "+m.getValue());    
              }      
    }
}