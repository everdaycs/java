package demo3;

import demo2.TestDemo;

public class Test extends TestDemo{
    public void func() {
        TestDemo testDemo = new TestDemo();
        System.out.println(super.a);

    }
    // super 不能再static方法中 所以不能再main函数里面写
    public static void main(String[] args) {
        Test test = new Test();
        test.func();
    }
}
