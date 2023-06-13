package Java_Programs;

abstract class Bike {
	abstract void run();
}

class Honda4 extends Bike {
	void run() {
		System.out.println("running safely");
	}
}

public class Abstraction_example {	 
	public static void main(String[] args) {
		Bike obj = new Honda4();
		obj.run();
	}
}

/* The given code is an example of abstraction in Java. 
 * It demonstrates the use of an abstract class and an abstract method, as well as the concept of method overriding.
 * In the code, there is an abstract class called "Bike" which has an abstract method named "run()". 
 * The "run()" method is declared without any implementation, using the "abstract" keyword. 
 * This indicates that any class that extends the "Bike" class must provide its own implementation of the "run()" method.
 * There is a concrete class called "Honda4" that extends the "Bike" class. 
 * It provides the implementation for the "run()" method by printing "running safely" to the console.
 * In the "main" method, an object of the "Honda4" class is created and assigned to a variable of type "Bike" 
   (which is allowed because "Honda4" is a subclass of "Bike"). 
 * The "run()" method is called on this object, resulting in "running safely" being printed to the console.
 * To explain this code in an interview, you can start by mentioning that it demonstrates the concept of abstraction in Java. 
 * An abstract class is used to declare the abstract method "run()", which serves as a blueprint for the behavior that subclasses must implement. 
 * Discuss how the "Honda4" class extends the "Bike" class and provides its own implementation of the "run()" method. 
 * Finally, mention that the "main" method creates an object of the "Honda4" class, assigns it to a variable of type "Bike", 
   and calls the "run()" method to execute the overridden implementation. */