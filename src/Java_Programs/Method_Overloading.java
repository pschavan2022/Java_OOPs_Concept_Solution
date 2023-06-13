package Java_Programs;

class Helper {

	static int Multiply(int a, int b) {

		return a * b;
	}

	static double Multiply(double a, double b) {

		return a * b;
	}
}

public class Method_Overloading {

	// Main driver method
	public static void main(String[] args) {

		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}
/* The provided code demonstrates an example of method overloading in Java. 
 * Method overloading allows a class to have multiple methods with the same name but different parameters. 
 * In this code, there are two methods named "Multiply" inside the "Helper" class.
 * The first "Multiply" method takes two integer parameters, "a" and "b," and returns their multiplication result as an integer. 
 * This method is invoked by passing two integer arguments: 2 and 4. The result, 8, is printed to the console using the System.out.println() statement.
 * The second "Multiply" method takes two double parameters, "a" and "b," and returns their multiplication result as a double. 
 * This method is invoked by passing two double arguments: 5.5 and 6.3. 
 * The result, 34.65, is printed to the console using the System.out.println() statement.
 * In summary, the code demonstrates how method overloading works by defining multiple methods with the same name but different parameter types. 
 * The appropriate method is invoked based on the arguments provided during the method call.*/