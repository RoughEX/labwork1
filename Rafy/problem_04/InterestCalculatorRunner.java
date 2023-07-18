package problem_04;

public class InterestCalculatorRunner {
    public static void main(String[] args) {
        InterestCalculator myinterest = new InterestCalculator();
        System.out.println("My balance after 1 year: "+myinterest.calculate(1, 10000, 5)+"$");
        System.out.println("My balance after 2 year: "+myinterest.calculate(2, 10000, 5)+"$");
        System.out.println("My balance after 3 year: "+myinterest.calculate(3, 10000, 5)+"$");
    }
    
}
