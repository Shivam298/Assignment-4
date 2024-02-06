class Parent{
    Parent(){
        System.out.println("Parent class construtor called");
    }
    void display(){
        System.out.println("Parent class");
    }
}
class Five extends Parent{//extending parent class
    Five(){
        System.out.println("Five class construtor called");
    }
    void display(){//overriding parent class method
        System.out.println("Five class");
    }
    public static void main(String[] args){
        Five obj=new Five();//creating object of main class
        obj.display();
    }
}