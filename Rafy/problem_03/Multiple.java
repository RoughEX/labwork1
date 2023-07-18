package problem_03;

public class Multiple {
    public long factorial(int n){
        long result =1;
        for(int number = 1 ; number <= n ; number++){
            result = result * number;
        }
        return result;
    }
}
