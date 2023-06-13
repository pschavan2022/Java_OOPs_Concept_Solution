package Java_Programs;
public class Encapsulation_example {
	  private String name;

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	

	  public static void main(String[] args) 
 {
	    Encapsulation_example myObj = new Encapsulation_example();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	  }
	  
}

/* The provided code demonstrates an example of encapsulation in Java. 
 * Encapsulation is a principle of object-oriented programming that involves bundling data (variables) 
   and methods (functions) together as a single unit called a class. 
   In this case, the code defines a class named "Encapsulation_example" within the package "Java_Programs."
 * Inside the class, there is a private instance variable called "name," which is accessible only within the class itself. 
 * This is an example of data encapsulation, where the variable is encapsulated and can be accessed or modified only through 
   specific methods provided by the class.
 * The class also includes two methods: a getter method named "getName()" and a setter method named "setName(String newName)." 
 * The getter method returns the value of the "name" variable, and the setter method sets the value of the "name" variable based on the provided argument.
 * In the "main" method, an object of the "Encapsulation_example" class is created using the constructor. 
 * The setName() method is called on the object, passing the argument "John" to set the value of the "name" variable. 
 * Finally, the getName() method is called to retrieve the value of the "name" variable, 
   which is then printed to the console using System.out.println().
 * This code showcases encapsulation by hiding the internal details (the "name" variable) 
   and providing controlled access to it through the getter and setter methods. 
 * Encapsulation helps maintain data integrity, improves code maintainability, and enhances security by controlling the access to class variables. */