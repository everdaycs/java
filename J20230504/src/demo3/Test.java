package demo3;

import java.util.Objects;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person)obj;
        return this.name.equals(person.name)&&this.age==person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 10);
        System.out.println(person1);
        Person person2 = new Person("zhangsan", 10);
        System.out.println(person2);
        System.out.println("=======");

        /*// 此时比较的是变量中地址
        System.out.println(person1 == person2);

        System.out.println(person1.equals(person2));*/

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
