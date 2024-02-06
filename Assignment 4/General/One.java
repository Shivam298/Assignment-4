abstract class Sun {
    abstract void printInfo();
}
 
// Abstraction performed using extends
class Employee extends Sun {
    void printInfo()
    {
        System.out.println("Printing info Employee");
    }
}
 
// Base class
class One {
    public static void main(String args[])
    {
        Sun s = new Employee();
        s.printInfo();
    }
}