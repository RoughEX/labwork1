package problem_03;

import java.awt.*;
public class AreaTesterRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5,7,8);
        AreaTester object = new AreaTester();
        System.out.println(object.getArea((int)rectangle.getHeight(),(int)rectangle.getWidth()));
    }
    
}
