package demo1;

class Base {
    public int a = 1;
    public int b;
}

class Derived extends Base {
    public int c;
    public void method() {
        a = 10;
        b = 20;
        c = 30;
    }
}
// 当子类和父类是 同名成员变量的时候
// 在子类当中

class Student {

}

class Teacher {

}

// 别的类的方法或者字段出现再这个类中 啧是组合

class School {
    public Student[] students;
    public Teacher[] teachers;

    public School() {
        this.students = new Student[10];
        this.teachers = new Teacher[10];
    }
}
public class Test2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.method();
    }
}




