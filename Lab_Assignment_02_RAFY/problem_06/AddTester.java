package problem_06;
import java.awt.*;
public class AddTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0,0);
        System.out.println("Expected X is: 0");
        System.out.println("Expected Y is: 0");
        System.out.println("Expected Width is: 25");
        System.out.println("Expected Height is: 40");
        System.out.println("\nActual X is: " + box.getX());
        System.out.println("Actual Y is: " + box.getY());
        System.out.println("Actual Width is: " + box.getWidth());
        System.out.println("Actual Height is: " + box.getHeight());
        }
}
