package demo1;

// 在同一个包底下不能有 两个相同观点类
class OuterClass2 {
    public int data1 = 1;
    public int data2 = 2;
    public static int data3 = 3;
    // 静态内部类

    /**
     * 1. 如何获取 静态内部类对象
     * 2. 如何在静态内部类中 访问外部类的非静态的数据成员
     * 静态类需要引用
     */
    static class InnerClass {
        public int data4 = 4;
        public int data5 = 4;
        public static int data6 = 6;

        public void test() {
            OuterClass2 outerClass2 = new OuterClass2();
            System.out.println(outerClass2.data1);
            System.out.println(data5);
            System.out.println(data4);
            System.out.println(data6);
            System.out.println("内部类的test方法");
        }
    }

}
public class Test3 {
    public void func() {
        class Inner {
            public int data1 = 1;
        }
        Inner inner = new Inner();
        System.out.println(inner.data1);
    }
    public static void main(String[] args) {
        OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();
        innerClass.test();
    }
}
