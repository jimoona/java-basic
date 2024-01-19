package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() { //자기꺼 쓰면 되니까 매개변수 필요 없음
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return  width == height;
    }
}
