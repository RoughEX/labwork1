package problem_04;

public class InterestCalculator {
    public double calculate(int year,int capital,int rate){
        double answer = capital*Math.pow(1+((double)rate/100.0),year);
        return answer;
    }
    
}
