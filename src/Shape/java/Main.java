package Shape.java;

import Shape.java.Circle;
import Shape.java.Rectangle;
import Shape.java.Shape;

public class Main {
	public static void main(String[] args) {
        // Tao mang kieu Shape, khoi tao cac doi tuong Rectangle va Circle
        Shape[] arr = {new Rectangle(5.0, 10.0), new Circle(4.5)};

        // Hien thi thong tin
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
