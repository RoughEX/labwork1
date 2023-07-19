package problem_11;
import java.util.*;
public class DieSimulator {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNumber = generator.nextInt(6) + 1;
        
        System.out.println("The die rolled: " + randomNumber);
    }
}
