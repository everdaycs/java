import javax.swing.plaf.synth.SynthUI;

public class Test {
    public static void main(String[] args) {
        // 左移相当于是乘法,

    }
    public static void main6(String[] args) {
        System.out.println(5/2);
        System.out.println((float)5/2);
        System.out.println(5/(float)2);
        System.out.println((float) (5/2));
        System.out.println("============");

        /* ctrl + shift + / 块注释
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
        System.out.println(11.5%2);*/

       /* int a = 10;
        a += 10;
        System.out.println(a);
        long d = 100;
        int c = 9;
        //c = c + d;
        c += d; // c = (int)c + d 特点: 运算符会帮我们进行类型转换
        System.out.println(c);*/
        int a = 10;
        int b = ++a;
        //int b = a++;
        System.out.println(a);
        System.out.println(b);


        //System.out.println(3<a <100); // false不能和100 来比较 3 < a产生的是一个ture, 不能和100 来比较.

        System.out.println(a == 10);
        System.out.println(a != 10);
        System.out.println(!(a == 10));

        // 短路与
        //当表达式1为假的时候, 就不会执行表达式2了
        System.out.println(10 > 20 && 10 / 0 == 0);

        // 短路或
        // 当表达式1为真的时候, 就不会执行表达式2
        System.out.println(10 < 20 || 10 / 0 == 0);

        // 这个不能表示短路
        System.out.println(10 > 20 & 10 / 0 == 2);
        System.out.println(10 < 20 | 10 / 0 == 2);

    }
    public static void main5(String[] args) {
        // 在C语言当中, 没有字符串的类型
       /* char *_p = "12321312";
        char p = "fwefwefwe";*/
        String str = "hello";
        System.out.println(str);

        int a = 100;
        // 调用String这个类型的方法
        String s1 = String.valueOf(a);
        System.out.println(s1);

        // 双引号当中 包含若干的字符
        String s2 = a + ""; // 此时这个加号是拼接的意思
        System.out.println(s2);

        String s3 = 10 + 20 + "x";
        String s4 = "x" +10 + 20 ;

        System.out.println(s3);
        System.out.println(s4); // 字符串拼接字符串
        System.out.println("===================");


        // 调用Integer的方法 来实现准话
        String str3 = "100000";
        int ret = Integer.valueOf(str3);
        System.out.println(ret + 1);

        int ret2 = Integer.parseInt(str3);
        System.out.println(ret2 + 2);




    }
    public static void main3(String[] args){
        int a= 10;
        long b = 20L;
        int c = (int)(a+b);
        long d = a + b;

        System.out.println("=============");

        byte b1 = 125;
        byte b2 = 123;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);

        int b4 = b1 + b2;
        System.out.println(b4);

    }
    public static void main2(String[] args){
        int a = 10;
        long b = 100L;
        // a = b; // 八个字节不能赋值给4个字节
        b = a; // 隐式类型转换, 把a类型提升为long类型
        a = (int)b;// 强制类型转换 我对此次强转负责, 如果丢失数据认可

        int c = 256;

        byte c2 = 127;

        boolean flg = true;
        //a = (int) flg; // 不相干的类型不能相互转换
        // Java当中 对于字面值的直接赋值 是允许的, 前提是没有超过表示范围. 但是超过表示范围之后, 就会检查
    }
    public static void main1(String[] args) {
        // 0 是假,非0 是真
        // 大小没有明确规定
        boolean flg = true;
        System.out.println(flg);
    }
}