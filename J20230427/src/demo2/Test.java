package demo2;

// 当该类中有抽象方法时, 该类一定时抽象类
abstract class Shape {
    public int a = 10;
    public abstract void draw();
    public Shape() {
        // 用来让子类调用, 帮助这个抽象类 初始化自己的成员
    }
}
// 当普通类继承了抽象类, 一定要写抽象类中的抽象方法
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

// private 修饰的不能有多态
// final 和abstrat 不能同时存在的
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("花");
    }
}
public class Test {

    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape = new Rect();
        drawMap(new Rect());
        drawMap(new Flower());
        /*
         new Rect() -> 匿名对象 没有名字的对象
         匿名对象的缺点: 每次使用都得重新实例化 对象
        */
    }
}
