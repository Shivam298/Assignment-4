import java.util.*;
public class Cart{
   
        ArrayList<Product> list=new ArrayList<Product>();
        public void add(Product pr){
            list.add(pr);
        }
        public void remove(Product pr){
            list.remove(pr);
        }
        public List<Product> get(){
            return list;
        }
    }
