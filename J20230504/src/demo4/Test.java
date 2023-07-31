package demo4;

import java.util.Arrays;
import java.util.Comparator;

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;
        if(this.age > o.age) {
            return 1;
        }else if (this.age < o.age) {
            return -1;
        }else {
            return 0;
        }
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// 比较器
class AgeCompare implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class NameComparator implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {
    public static void bubbleSort(Comparable[] comparable) {
        for (int i = 0; i < comparable.length-1; i++) {
            for (int j = 0; j < comparable.length-1 - i; j++) {
                if (comparable[j].compareTo(comparable[j + 1]) > 0) {
                    Comparable tmp = comparable[j];
                    comparable[j] = comparable[j + 1];
                    comparable[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 15);
        Student studnet2 = new Student("lisi", 10);

        AgeCompare ageCompare = new AgeCompare();
        System.out.println(ageCompare.compare(student1, studnet2));

        NameComparator nameComparator = new NameComparator();
        System.out.println(nameComparator.compare(student1, studnet2));

    }


    public static void main222(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student studnet2 = new Student("lisi", 10);

        /*System.out.println(student1.compareTo(studnet2)); // student1 这个对象和student2这个对象比较

        Student[] students = new Student[3];
        students[0] = new Student("zhangsan", 10);
        students[1] = new Student("zhgsan", 15);
        students[2] = new Student("zhang", 1);

//        Arrays.sort(students);
        bubbleSort(students);
        System.out.println(Arrays.toString(students));*/

    }
}
