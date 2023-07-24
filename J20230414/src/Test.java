import java.awt.*;
import java.util.Scanner;

public class Test {
    /*public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int age = scan.nextInt();
            System.out.println(age);
        }
    }*/
    public static void main5 (String[] args) {
       /* System.out.println("输出且换行");
        System.out.print("不换行");
        System.out.printf("%d\n", 10);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个整数: ");
        int age = scan.nextInt();
        System.out.println("年龄" + age);
        scan.nextLine();
        System.out.println("请输入你的姓名");
        String name = scan.nextLine(); // nextline 是读一行, next是遇到空格结束!
        System.out.println("姓名" + name);

        System.out.println("薪资是多少");
        float salary = scan.nextFloat();
        System.out.println("薪资" + salary);
        scan.close();
    }
    public static void main4(String[] args) {
        /*int sum = 0;
        *//*for (int i = 0; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);*//*

        for (int j = 0; j <=5; j++) {
            int ret= 1;
            for (int i = 0; i <= j; i++) {
                ret *= i;
            }
            sum += ret;
        }
        System.out.println(sum);*/
        int a = 0;
        do {
            System.out.println(a);
        } while (a != 0);
        // 不建议使用do while 循环

    }
    public static void main3(String[] args) {
       /* int n = 1;
        while (n <= 5) {
            if (n == 2) {
                continue;
            }
            System.out.println(n);
            n++;
        }*/
        // 找到100 - 200 中第一个3 的背书
        int i = 100;
        while (i <= 200) {
            if (i % 3 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
        // 求100 - 200 之间 既能被三整除又能被四整除的数据 要求使用: continue
        int n = 0;
        for (n = 100; n <= 200; n++){
            if (n % 12 != 0){
                continue;
            }
            System.out.println(n);
        }
    }
    public static void main2(String[] args) {
        int num = 1;
        // 死循环 循环条件一直都是真的
        // 每个循环是一个独立的个体
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        // 死循环
        /*while (true) {

        }*/
        int ret = 1;
        int n = 1;
        while (n <= 5) {
            ret = ret * n;
            n++;
        }
        System.out.println(ret);
        int k = 1;
        n = 1;
        ret = 1;
        int sum = 0;
        while (k <= 5) {
            while (n <= k) {
                ret = ret * n;
                n++;
            }
            sum = sum + ret;
            k++;
        }
        System.out.println(sum);
    }
    // int -> Integer
    // char -> Character
    public static void main1(String[] args) {
       /* System.out.println("aaaaa");
        System.out.println("cccc");
        System.out.println("bbbbb");*/

        // 如何调试代码
       /* int score = 92;
        if (score >= 19) {
            System.out.println("jweoifjewoi");
        } else {
            System.out.println("12345");
        }*/
        /*for (int year = 1000; year <= 2000; year++) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is 闰年");
                }
            } else {     // else 会跟最近的一个if匹配
                if (year % 4 == 0) {
                    System.out.println(year + " is 闰年");
                }
            }
        }*/

        int a = 10;
        // 不能做Switch 参数的数据类型有哪些?  基本数据类型当中: float double long
        switch (a) { // swtich 里面不能有复杂的运算
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("4");
                break;
            case 4:
                System.out.println("5");
                break;
            default:
                break;
        }

        String str = "hello";
        // 不能做Switch 参数的数据类型有哪些?  基本数据类型当中: float double long
        switch (str) {
            case "abc":
                System.out.println("p");
                break;
            case "hello":
                System.out.println("r");
                break;
            case "vdb":
                System.out.println("5");
                break;
            case "erg":
                System.out.println("7");
                break;
            default:
                break;
        }
        // 不能用Boolean类型
    }
}