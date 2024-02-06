interface In1 {
   
    // public, static and final
    final int a = 10;
 
    // public and abstract
    void display();
}
 
// A class that implements the interface.
class Third implements In1 {
   
    // Implementing the capabilities of
    // interface.
    public void display(){ 
      System.out.println("Interface"); 
    }
    public static void main(String[] args)
    {
        Third t = new Third();
        t.display();
        System.out.println(a);
    }
}