class Father {
    public String name = "帅比";
    public int age = 19;

    public void eat() {
        System.out.println("帅哥就得吃吃吃");
    }
}
class Son extends Father {

}
public class Home {
    public void print() {
        Son son = new Son();
        System.out.println(son.age);
        System.out.println(son.name);
        son.eat();
    }
    public static void main(String[] args) {
        Home home = new Home();
        home.print();
    }
}
