package src5;

/*
* 接口是不能被接口实现的
* 接口和接口之间可以通过extends进行联系
* 一个接口可以extends多个接口
*
*
* */
interface A{
    void func1();
}
interface B extends A{
    void func2();
}
interface C extends B{
    void func3();
}

class D implements C{
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }
}



class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}



class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}


//一个类  可以 同时  继承 一个父类   和 同时 实现多个接口
class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}




public class TestDome {
    public static void walk(IRunning iRunning){
        iRunning.run();
    }

    public static void swim(ISwimming iSwimming){
        iSwimming.swim();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        walk(cat);

        Frog  frog = new Frog("呱呱");
        walk(frog);
        swim(frog);

    }

}



