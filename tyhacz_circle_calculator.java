package java_app;
import java.util.Scanner;
/**
 * @author zachary tyhacz
 */
public class tyhacz_circle_calculator {
    public static void main(String[] args) {
        double diameter;
        double circumference;
        double area;
        double radius = 0.0f;
        Scanner input = new Scanner(System.in);
        
        System.out.println("-_Circle Calculator_-");
        System.out.print("Enter radius: ");
        radius = input.nextInt();
        
        diameter = 2*radius;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * radius*radius;
        
        System.out.printf("Diameter: %f%n",diameter);
        System.out.printf("Circumference: %f%n",circumference);
        System.out.printf("Area: %f%n",area);
}
}