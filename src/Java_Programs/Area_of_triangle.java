package Java_Programs;

import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = calculateArea(base, height);
        System.out.println("Area: " + area);

        scanner.close();
    }

    public static double calculateArea(double base, double height) {
        return (base * height) / 2.0;
    }
}
