package Java_Programs;

class Animal {

	Animal() {
		System.out.println("animal is created");
	}
}

class Dog extends Animal {

	Dog() {
		super();
		System.out.println("dog is created");
	}
}

public class SuperKeyword_example {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}
/* The provided code demonstrates the concept of inheritance and the use of the super keyword in Java.
 * The code includes three classes: Animal, Dog, and SuperKeyword_example.
 * The Animal class has a default constructor that prints the message "animal is created".
 * The Dog class extends the Animal class. It also has a default constructor. 
 * Inside the constructor, the super() statement is used to call the constructor of the parent class (Animal), 
   which prints the message "animal is created". After that, the message "dog is created" is printed.
 * The SuperKeyword_example class contains the main method. 
 * In the main method, an instance of the Dog class is created using the statement Dog d = new Dog();. 
 * This triggers the execution of the constructor in the Dog class, which in turn invokes the constructor in the Animal class using the super() statement. 
 * Finally, the messages "animal is created" and "dog is created" are printed to the console.
 * In summary, the code demonstrates the inheritance relationship between the Animal and Dog classes. 
 * The super keyword is used to invoke the constructor of the parent class. 
 * This allows the initialization code defined in the parent class to be executed before the initialization code in the child class.*/