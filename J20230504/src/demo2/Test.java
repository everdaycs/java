package demo2;

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C {
    void testC();
}
// 有一个接口, 具备B 和 C接口的功能
interface D extends B, C {
    // D 这个接口 具备了 B 和 C的功能
    void testD();
}
// 需要重写三个方法
public class Test implements D{
    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }

    @Override
    public void testD() {

    }
}
