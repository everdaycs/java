package demo5内部类;

class OuterClass {
    // 实例内部类
    class InnerClass {

    }
    static class InnerClass2 {
        // 静态内部类
    }

}
interface A {
    void testA();
}
public class Test {
    public static void main(String[] args) {
        // 一下代码可以认为: 有一个类 实现了A 接口并且重写了A接口中的方法
        new A(){
            @Override
            public void testA() {
                System.out.println("haha");
            }
        }.testA();// 这个类没有名字, 匿名内部类
    }
}
