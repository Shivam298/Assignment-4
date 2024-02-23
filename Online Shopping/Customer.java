import java.util.*;
import java.io.*;
public class Customer{

        String name;
        List<Product> orders;
        public Customer(String name){
            this.name=name;
        }
        public void add(List<Product> list){
            orders=list;
        }
        public void showDetails(){
            System.out.println("Name : "+name);
            System.out.println("Orders :"+orders);
        }
    }
