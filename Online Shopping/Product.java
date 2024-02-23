import java.util.*;
import java.io.*;
public class Product{
    
  
         public Product(String name,double price){
            this.name=name;
            this.price=price;
        }
        String name;
        double price;
        
       
        public String getName(){
            return this.name;
        }
        public double getPrice(){
            return this.price;
        }
    }
