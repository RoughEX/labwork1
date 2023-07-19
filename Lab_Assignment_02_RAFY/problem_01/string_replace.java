package problem_01;
//import java.util.*;
public class string_replace{

    private String stateName;
    public string_replace(){
        stateName="Mississippi";
    }
    public string_replace(String statename){
        this.stateName=statename;
    }
    public String replaceI(){
        String NewStateName = stateName.replace("i","ii");
        return NewStateName;
    }
    public String replaceI(String statename){
        String NewStateName = statename.replace("i","ii");
        return NewStateName;
    }
    public String replaceSS(){
        String NewStateName = stateName.replace("ss","s");
        return NewStateName;
    }
    public String replaceSS(String statename){
        String NewStateName = statename.replace("ss","s");
        return NewStateName;
    }
} 
