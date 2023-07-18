package problem_05;

public class ShowMyName {
    public static void main(String[] args) {
        String name = "Rafy";
        int length = name.length() + 4;
        String horizontalLine = "+" + "-".repeat(length) + "+";
        String emptyLine = "|" + " ".repeat(length) + "|";

        System.out.println(horizontalLine);
        System.out.println(emptyLine);
        System.out.println("|  " + name + "  |");
        System.out.println(emptyLine);
        System.out.println(horizontalLine);
    }
    
}
