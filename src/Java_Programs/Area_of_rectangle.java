package Java_Programs;

public class Area_of_rectangle {

    int length;
    int breadth;

    //constructor to initialize values
    Area_of_rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
 

    public static void main(String[] args) {
        Area_of_rectangle rectangle = new Area_of_rectangle(2, 16);
        rectangle.getArea();
    }
}


/* The given code is an example of a Java program that calculates the area of a rectangle. 
 * It demonstrates the use of a class and its constructor, as well as a method for calculating the area.
 * In the code, there is a class called "Area_of_rectangle" which has two instance variables, 
   "length" and "breadth," representing the dimensions of the rectangle. 
 * The class also has a constructor that takes these dimensions as parameters and initializes the instance variables.
 * The class contains a method named "getArea()" which calculates the area of the rectangle by multiplying the length and breadth. 
 * The calculated area is then printed to the console using the "System.out.println()" statement.
 * In the "main" method, an object of the "Area_of_rectangle" class is created and initialized with length 2 and breadth 16. 
 * The "getArea()" method is called on this object, resulting in the area of the rectangle (32) being printed to the console.
 * To explain this code in an interview, you can start by mentioning that it calculates the area of a rectangle based on its length and breadth. 
 * You can then discuss the use of a class and its constructor to create an object with the given dimensions. 
 * Explain how the "getArea()" method performs the calculation and prints the result. 
 * Finally, mention that the "main" method creates an object and calls the "getArea()" method to obtain and display the area of the rectangle. */