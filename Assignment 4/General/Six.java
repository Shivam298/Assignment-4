// Java Program to implement 
// Java Abstraction 

// Abstract Class declared 
abstract class Animal { 
	private String name; 

	public Animal(String name) { this.name = name; } 

	public abstract void makeSound(); 

	public String getName() { return name; } 
} 

// Abstracted class 
class Dog extends Animal { 
	public Dog(String name) { super(name); } 

	public void makeSound() 
	{ 
		System.out.println(getName() + " barks"); 
	} 
} 


// Driver Class 
public class Six { 
	// Six Function 
	public static void main(String[] args) 
	{ 
		Animal myDog = new Dog("Buddy"); 
		myDog.makeSound(); 
	} 
}