package demo;

// 定义接口
interface IShape {
    // 接口当中的成员默认全都是 pulic static final
    //         成员方法默认都是 public abstract
    //
    public static final int a = 10;
    public abstract void draw();

    default public void test() {
        System.out.println("test");
    }

    default public void test21() {
        System.out.println("fewfew");
    }

    public static void test2() {
        System.out.println("static");
    }
}

class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Flower implements IShape {
    @Override
    public void draw() {
        System.out.println("花");
    }
}
//
public class TestDemo {
    public static void drawMap(IShape iShape) {
        iShape.draw();
    }
    public static void main(String[] args) {
        // IShape iShape = new IShape();
        IShape iShape1 = new Rect();
        IShape iShape2 = new Flower();
        drawMap(iShape1);
        drawMap(iShape2);
        System.out.println(iShape1.a);
    }
}
