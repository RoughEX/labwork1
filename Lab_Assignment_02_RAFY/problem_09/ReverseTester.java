package problem_09;

public class ReverseTester {
    public static void main(String[] args) {
        String input = "desserts";
        
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();  
        
        String reversedString = sb.toString();
        
        System.out.println("Reversed String: " + reversedString);
        System.out.println("Expected Value: " + reverseString(input));
    }
    
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();  
        
        return sb.toString();
    }
}
