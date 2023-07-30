import java.security.PublicKey;

class Animal {
    // 这是动物的两个成员变量
    public String name;
    public int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 下面是动物的两个属性
    public void eat() {
        System.out.println(name + "正在吃饭");
    }
    public void sleep(String name) {
        System.out.println(name + "正在睡觉");
    }
}


// 动物只是一个统称, 我们需要更加细节的东西, 比如说 小猫,小狗
// 新建小猫小狗, 因为小猫小狗都是属于动物 所以可以用动物的很多东西
// 比如说 name age 成员变量 还有 eat() sleep() 成员方法

class Dog extends Animal {
    // 构造方法

    public Dog (String name, int age) {
        super(name, age);
    }
    // 狗有不一样的习性, 狗会叫
    public void bark() {
        System.out.println(name + "汪汪汪");
    }
    public void eat() {
        System.out.println(name + "狗在吃狗粮");
    }
}


class Cat extends Animal {
    // 猫也有不一样的习性, 猫会猫叫
    public Cat(String name, int age) {
        super(name, age); // 理解成调用父类的构造方法
    }
    public void miao() {
        System.out.println(name + "喵喵喵");
    }

    public void eat() {
        System.out.println(name + "猫在吃猫粮");
    }

}

public class World {
    public static void main(String[] args) {
        // 调用父类的方法
        Animal dog = new Dog();
        dog.sleep("小狗");
        // 注意
        dog.eat();
        Animal cat = new Cat();
        cat.sleep("小猫");
        cat.eat();
        //
    }
}
