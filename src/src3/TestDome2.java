package src3;
/*
* 抽象类：包含抽象方法的类。
* 1.用abstract关键字修饰
* 2.在抽象类中，可以允许存在普通类的属性和方法
* 3.和普通类不一样的是 包含抽象方法
* 4. 抽象类 不能被实例化
* 5.抽象类的主要作用是被继承
* 6.抽象类就是用来被继承的所以不能用final修饰
*      final abstract class Shape
* 7.抽象方法也不能是私有的private或者 静态的 static
* 8.只要有一个类继承了这个抽象类，那么必须重写抽象类中的方法    A类
* 9.如果这个类不想重写 抽象类里的抽象方法 也可以设置为抽象类
*          abstract class B extends Shape{
*          }
*
* */
abstract class Shape {
    public int a;
    public void func(){
        System.out.println("  ");
    }
    public abstract void draw();
}

abstract class B extends Shape{

}


class C extends B{
    @Override  //这里面必须重写
    public void draw() {

    }
}



class A extends Shape{
    @Override
    public void draw() {

    }
}



class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}




class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}


public class TestDome2 {
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
