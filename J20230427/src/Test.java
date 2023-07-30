class Animail {
    public String name;
    public int age;

    public Animail(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + "正在吃!");
    }

    @Override
    public String toString() {
        return "Animai{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class ggg extends Animail {
    public ggg (String name, int age) {
        super(name,age);
    }

    public void wangWang() {
        System.out.println(name + "正在旺旺");
    }
    public void eat() {
        System.out.println(name + "正在吃猫粮");
    }
}

class Bird extends Animail {
    public Bird (String name, int age) {
        super(name,age);
    }

    public void fly() {
        System.out.println(name + "正在飞");
    }
    public void wangWang() {
        System.out.println(name + "正在旺旺");
    }
}

public class Test {

    public static void main(String[] args) {
        Animail animail1 = new ggg("zwsefd",1919);
        animail1.eat(); // 不能调用子类的eat() 当子类中没有eat方法的时候
    }
    /**
     * 有三种方式可以发生向上转型
     * 1. 直接赋值
     * 2. 方法传参的方式
     * 3. 返回值
     * 其实就是将父类变成子类
     * @param args
     */
    public static void main44(String[] args) {
        ggg ggg = new ggg("xiaomao" , 1999);
        Animail animail = ggg;

        // 父类引用引用了子类变量
        Animail animail1 = new ggg("xiaomao", 199);
        Animail animail2 = new Bird("xiaoniao",999);
        ggg ggg1 = new ggg("fwe",1933);
        Bird bird = new Bird("fewfewf", 5757);

        func1(ggg1);
        func1(bird);

        Animail animail3 = func2();
        Animail animail4 = func2();
    }

    public static void func1(Animail animal) {
        animal.eat();

    }

    public static Animail func2() {
        return new Bird("fhtht", 999);
    }

    public static void main22(String[] args) {
        ggg ggg2 = new ggg("小猫", 199);
        ggg2. eat();
        ggg2.wangWang();
        System.out.println("========");
        Animail animal = new Animail("fewf", 1990);
        animal.eat(); // 只能访问Animal的类的eat 而不是子类的eat
    }
}
