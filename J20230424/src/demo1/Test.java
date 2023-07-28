package demo1;

class Animal{
    String name;
    int age;
    public String color;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

/*    static {
        System.out.println("Animal 的静态代码块");
    }

    {
        System.out.println("Animal 的实例代码块");
    }*/
    public void eat() {
        System.out.println(name + "吃狗粮 -- Animal");
    }
}
// 先帮助父类进行构造, 然后在构造子类自己
// 此时相当于. 先帮助父类进行了初始化操作
class Dog extends Animal{
/*    static {
        System.out.println("Dog 的静态代码块");
    }

    {
        System.out.println("Dog 的实例代码块");
    }*/
    public Dog (String name) {
        super(name); // 通过super 来调用你想调用的构造方法
        System.out.println("Dog 的构造方法");
    }
    public void eat() {
        System.out.println(name + "正在吃狗粮");
    }

    public void bark() {
        System.out.println(name + "汪汪");
    }
}

// 子类继承父类之后, 会继承父类成员的方法和成员变量
// 达到了代码的服用效果
class Cat extends Animal{

    // 默认提供
/*    public Cat() {
        super();
    }*/
    public Cat(String name) {
        super(name);
        System.out.println("cat的构造方法");
    }

    public void eat() {
        System.out.println(name + "正在吃猫粮");
    }

    public void miMi() {
        System.out.println(name + "喵喵");
    }
}
public class Test {

    public static void main(String[] args) {
        //
        Animal animal1 = new Dog("小狗1");
        animal1.eat();
        // 父类不能调用子类的方法
        // 不能进入调用
    }
    // 静态的代码都是先执行
    // 父类的实例化 构造方法结束了才会有子类的实例化和构造方法
    public static void main22(String[] args) {
        Dog dog1 = new Dog("fef");
        System.out.println("===============");
        Dog dog2 = new Dog("fewf");
        // 第二次执行的时候, 就不会再执行静态的代码

    }
    public static void main3(String[] args) {
        Animal animal = new Animal("animal");
        System.out.println("========");
        Animal animal1 = new Animal("wfew");
    }
    public static void main2(String[] args) {
        Dog dog = new Dog("zhangsan");
        dog.name = "张三";
        dog.age = 4;
        dog.eat();
        dog.bark();
        System.out.println("============");
        Cat cat = new Cat("wefewf");
        cat.name = "李四";
        cat.age = 6;
        cat.eat();
        cat.miMi();
    }
}
