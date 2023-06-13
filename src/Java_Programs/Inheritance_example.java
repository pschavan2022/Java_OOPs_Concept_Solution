package Java_Programs;
class Employee {

		 float salary=40000;  
		}  

class Programmer extends Employee
      {  
		 int bonus=10000;  
      }
	
public class Inheritance_example {
	
	public static void main(String args[])
      {  
		Programmer p=new Programmer();  
	    System.out.println("Programmer salary is:"+p.salary);  
	    System.out.println("Bonus of Programmer is:"+p.bonus);  
		} 
	
} 
/* The provided code demonstrates an example of inheritance in Java. 
 * Inheritance is a fundamental concept in object-oriented programming that allows one class to inherit the properties and methods of another class. 
 * In this code, there are three classes: "Employee," "Programmer," and "Inheritance_example."
 * The "Employee" class serves as the base class or superclass. It contains a single instance variable called "salary," 
   which is assigned a value of 40000. This variable represents the salary of an employee.
 * The "Programmer" class extends the "Employee" class, making it the derived class or subclass. 
 * It inherits the "salary" variable from the "Employee" class and introduces its own instance variable called "bonus," 
   which is assigned a value of 10000. The "bonus" variable represents an additional bonus amount specific to programmers.
 * The "Inheritance_example" class is the entry point of the program and contains the "main" method. 
 * Inside the "main" method, an object of the "Programmer" class named "p" is created. 
 * This object inherits the "salary" variable from the "Employee" class and has its own "bonus" variable. 
 * The values of both variables are then printed to the console using System.out.println() statements.
 * In summary, the code illustrates inheritance by creating a specialized class ("Programmer") 
   that inherits properties from a more general class ("Employee"). 
 * By inheriting the "salary" variable, the "Programmer" class can access and display the salary value of an employee. 
 * Additionally, the "Programmer" class introduces its own variable ("bonus") to represent an additional amount specific to programmers.*/