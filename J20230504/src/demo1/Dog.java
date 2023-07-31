package demo1;

// 可以实现n个结构 用","连接
// 先继承再实现
// 标准的一些行为放到接口当中.
public class Dog extends Animal implements IRunning, ISwimming {
    @Override
    public void run() {
        System.out.println(name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在游");
    }

    @Override
    public void eat() {
        System.out.println(name + "吃狗粮!");
    }
    public Dog(String name, int age) {
        super(name, age);
    }
}
