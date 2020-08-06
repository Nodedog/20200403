package src1;

class Animal{
    //public String name;
    public int a;



    //执行顺序 1 4 2 3 5 6（包含代码块的顺序）
    static {
        System.out.println("1.Animal的静态代码块！");
    }

    {
        System.out.println("2.Animal的代码块！");
    }

    /*public void eat(){
        System.out.println("src1.Animal" + this.name + "正在吃");
    }*/

    public Animal(int a){
        //this.name = name;
        this.a = a;
        System.out.println("3.aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}

class Dog extends Animal{
    public int b;
    static {
        System.out.println("4.Dog的静态代码块！");
    }

    {
        System.out.println("5.Dog的代码块！");
    }
    public Dog(int a,int b){
        //super(name);
        super(a);
        this.b = b;
        System.out.println("6.bbbbbbbbbbbbbbbbbbbbbbb");

    }
    /*public void eat(){
        System.out.println("dog" + this.name + "正在吃");
    }
*/
}

public class TestDome {
    public static void main(String[] args) {
        Dog dog = new Dog(10,20);
        //dog.eat();
       /* src1.Animal animal = new src1.Dog("小狗");
        animal.eat();*/
    }
}
