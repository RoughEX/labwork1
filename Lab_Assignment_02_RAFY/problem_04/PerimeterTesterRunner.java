package problem_04;

import java.awt.*;

public class PerimeterTesterRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5,7,8);
        PerimeterTester object = new PerimeterTester();
        System.out.println(object.getPerimeter((int)rectangle.getHeight(),(int)rectangle.getWidth()));
    }
}
