public class Guest{
    String name,ID;
    int curr=0;
    public Guest(String name,String ID){
        this.name=name;
        this.ID=ID;
        System.out.println("Guest added");
    }
    public void display(){
        System.out.println("Name :"+name+" ID :"+ID);
    }
    public void bill(){
        System.out.println("Total Bill for "+name+" is : "+(curr*1000));
    }
}