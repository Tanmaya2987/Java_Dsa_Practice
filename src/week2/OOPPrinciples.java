package week2;

//ABSTRACTION
abstract class Animal {

 // Abstract method
 abstract void sound();

 // Normal method
 void eat() {
     System.out.println("Animal is eating");
 }
}


//INHERITANCE
class Dog extends Animal {

 // ENCAPSULATION
 private String name;

 // Setter
 public void setName(String name) {
     this.name = name;
 }

 // Getter
 public String getName() {
     return name;
 }

 // POLYMORPHISM
 // Method overriding
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

public class OOPPrinciples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating object
        Dog dog = new Dog();

        // Encapsulation
        dog.setName("Tommy");

        System.out.println("Dog name: " + dog.getName());

        // Inherited method
        dog.eat();

        // Polymorphism
        dog.sound();

	}

}
