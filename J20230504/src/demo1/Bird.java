package demo1;

public class Bird extends Animal implements IFlying, ISwimming {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "吃东西");
    }

    // 不是所有动物都会飞的, 需要有个接口
    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在游泳");
    }
}
