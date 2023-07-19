package problem_01;

public class string_replace_runner {
    public static void main(String[] args) {
        string_replace object1 =new string_replace();
        System.out.println(object1.replaceI().length());
        System.out.println(object1.replaceSS(object1.replaceI()).length());
    }
    
}
