package problem_07;

public class ReplaceTester {
    public static void main(String[] args) {
    String state = "Mississippi";
    state = state.replace("i", "!").replace("s", "$");
    System.out.println("EXPECTED string: M!$$!$$!pp!");
    System.out.println("ACTUAL string: " +state);
    }
}