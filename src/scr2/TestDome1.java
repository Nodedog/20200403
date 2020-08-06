package scr2;


class Shape {
    public void draw() {

    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("圆形");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("矩形");
    }
}

public class TestDome1 {
    public static void func(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        func(shape1);
        Shape shape2 = new Rect();
        func(shape2);
    }

    public static void main1(String[] args) {
        Shape shape1 = new Cycle();
        shape1.draw();
    }
}
