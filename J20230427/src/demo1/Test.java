package demo1;

class Shape {
    public void draw() {
        System.out.println("画图形!");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("花");
    }
}
public class Test {
    public static void drawMap() {
        Cycle cycle = new Cycle();
        Rect rect = new Rect();
        Flower flower = new Flower();

        Shape[] shapes = {cycle, rect, cycle, rect, flower}; // 向上转型
        for (Shape shape : shapes) {
            shape.draw();
        }// 一个引用 调用一个方法
        // 原因: 引用的对象不一样
        // 多态0

    }

    public static void main(String[] args) {
        drawMap();
        /*Cycle cycle = new Cycle();
        Rect rect = new Rect();
        Flower flower = new Flower();

        String[] shapes = {"cycle", "rect", "cycle", "rect", "flower"};

        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("flower")) {
                flower.draw();
            }
        }

        drawMap(cycle);
        drawMap(rect);
        drawMap(flower);*/
    }
}
