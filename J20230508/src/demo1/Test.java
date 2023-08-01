package demo1;

interface A {
    void test();
}
public class Test {
    public static void main(String[] args) {
        int val = 10;
        // 匿名方法
        new A() {
            @Override
            public void test() {
                System.out.println("wefewfw " + val); // 在匿名内部类当中能够访问的是 没有被修改过的数据 --> 变量的捕获
                // 默认在这里能访问的是 被final修饰的
            }
        }.test();
    }
}
