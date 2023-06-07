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
