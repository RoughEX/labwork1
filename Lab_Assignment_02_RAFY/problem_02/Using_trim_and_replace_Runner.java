package problem_02;

public class Using_trim_and_replace_Runner {
    public static void main(String[] args) {
        String something=" Saim Ahmed Emon ";
        Using_trim_and_replace object = new Using_trim_and_replace();
        System.out.println(object.useTrim(something));
        System.out.println(object.useReplaceAllSpaces(object.useTrim(something)));
    }
    
}
