package problem_14;

import java.time.LocalDate;

public class DayTester {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate futureDay = today.plusDays(10);
        long difference = futureDay.toEpochDay() - today.toEpochDay();
        System.out.println("Difference between future day and today: " + difference + " days");
        System.out.println("Expected value: " + 10);
    }
}
