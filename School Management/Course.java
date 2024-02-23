public class Course{
    String name;
    int hrs;
    public Course(String name,int hrs){
        this.name=name;
        this.hrs=hrs;
    }
    public void change(int hrs){
        this.hrs=hrs;
    }
    public void change(String name){
        this.name=name;
    }
}