package demo1;

public class Test {
    public static void test1(Animal animal) {
        animal.eat();
    }

    public static void test2(IRunning iRunning) {
        iRunning.run();
    }
    public static void test3(ISwimming iSwimming) {
        iSwimming.swim();
    }
    public static void test4(IFlying iFlying) {
        iFlying.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird("小鸟", 1);
        Dog dog = new Dog("xiaogou", 199);
        test2(dog);
        System.out.println("=======");
        // 只要是接口 实现功能了, 都能传
        test3(bird);
        //test4(dog);

    }
    public static void main2(String[] args) {
        Bird bird = new Bird("小鸟", 1);
        Dog dog = new Dog("xiaogou", 199);

        test1(bird);
        test1(dog);
    }
}
