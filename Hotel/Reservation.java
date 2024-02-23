public class Reservation{
    int curr=0;
    public Reservation(){
        if(curr<11){
            System.out.println("Room reserved");
        }
        else{
            System.out.println("Room not reserved");
        }
    }
}