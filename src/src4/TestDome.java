package src4;
/*
*
*                         接口
*
*
* 1.接口是用interface关键字修饰的
* 2.里面的的数据成员必须是一个常量
*  public static final int a = 10;(要初始化）
* 3.里面的成员方法默认为
*    public abstract
* 4.在接口当中不能定义一个 已经实现了的方法
* 5.JDK1.8新特性：接口当中可以 有实现的方法  但是必须被default修饰
* 6.类和接口是 实现的关系  用implements 修饰
* 7.可以实现多个 接口    解决java当中 单继承的问题
*      class Cycle implements Shape,A{}
* 8.实现了该接口 就一定要重写接口中的方法
* 9.接口是不能实例化的
*
* */
/*abstract class Shape {
    public abstract void draw();
}*/

interface Shape{
    //public static final int a = 10;（默认的是这些可以直接写成int a = 10;）
   // int a = 10;
    //public abstract void draw();（默认的是这些可以直接写成 void draw();）
    void draw();

    //JDK1.8以后
  /*  default void func(){

    }*/
}

interface A{}

class Cycle implements Shape,A{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

class Rect implements Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

public class TestDome {
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

