package demo4;
// Clonable 接口是一个空接口 标记接口
// 证明当前的
class Money implements Cloneable{
    public double money = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 克隆肯定都是要super.clone
    }
}
class Person implements Cloneable{

    public int age;
    public Money m;
    public Money money = new Money();


    public Person( int age) {
        this.age = age;
        this.money = m;
    }

    @Override
    public String toString() {
        return "Person{"  +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person)super.clone(); // 直接调用clone
        tmp.m = (Money) this.m.clone();// 谁调用克隆方法谁就是this, 这里是调用m的clone
        return tmp;
    }
}
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person( 199);
        Person person2 = (Person)person1.clone();
        // 父类给子类范围变小了, 需要强转
        System.out.println(person1);
        System.out.println(person2);
    }
}
