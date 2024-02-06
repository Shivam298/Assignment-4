import java.util.*;
public class Two {

    public static void main(String[] args) {
              TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
              TreeMap<Integer,String> newMap=new TreeMap<Integer,String>();
              map.put(100,"Amit");    //associating specified value with specified key
              map.put(102,"Ravi");    
              map.put(101,"Vijay");    
              map.put(103,"Rahul");    
              newMap.putAll(map);   //copying key value pair from one tree to other
              for(Map.Entry m:newMap.entrySet()){ //displaying key value pairs   
               System.out.println(m.getKey()+" "+m.getValue());    
              }      
    }
}