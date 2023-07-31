package demo1;

public class Robot implements IRunning {
    public String name;
    public int age;
    public Robot(String name, int age){
        this.name = "Robert";
        this.age = 19;
    }
    @Override
    public void run() {
        System.out.println(name + "机器人在跑");
    }
}
