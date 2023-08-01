package demo1;

/**
 *  实例内部类
 */
class OuterClass {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /**
     * 1. 如何获取 实例内部类对象
     * 2. 在实例内部中, 是否可以定义静态的成员对象
     *    类加载的时候不会主动加载实例内部类 static 在类加载的时候被修饰
     * 3. 外部类类名 和 内部类中的数据成员一样的时候, 可以通过 OuterClass.this 进行访问
     *    实例内部类中是包含外部类的
     */
    class InnerClass {
        public int data1 = 222222;
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public void test() {
            System.out.println(OuterClass.this.data1);
            System.out.println(this.data1);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println("内部类的test方法");
        }
    }

    public void test() {
        System.out.println("外部类的test方法");
    }
}
public class Test2 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.test();
        System.out.println(innerClass.data1);
        // 获取实例内部类对象的时候, 依赖于外部类对象
        // 现有外部类 后有内部类
    }
}
