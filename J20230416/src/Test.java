public class Test {
    // 方法名称命名小驼峰 开头小写 后面的每一个单词首字母大写
    public static boolean isLeapYear(int year) {
        if ((0 == year % 4 && 0 != year % 100) || 0 == year % 400) {
            return true;
        }
        return false;
    }

    /*public static int add(int a, int b) {
        return a + b;
    }*/

    public static void func() {
        System.out.println("func()");
    }

    // 当方法执行的时候 遇到了return方法就结束了, 意味着该方法在栈上开辟的内存 就没有了
    public static void main2(String[] args) {
        boolean flag = isLeapYear(2003);
        System.out.println(flag);

    }

    public static int fac(int n) {
        int ret = 1;
        for (int i = 0; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    public static int facSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }

    // 实参在调用时传给形参
    // 在Java中, 实参的值永远都是赋值到形参中, 形参和实参本质是两个实体
    public static void main3(String[] args) {
        int ret = fac(5);
        // System.out.println(ret);
        System.out.println(fac(5));
        System.out.println(fac(6));
        System.out.println(fac(7));
        System.out.println(facSum(4));
    }

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    // 交换得学完类和对象
    public static void main44(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println((a + " " + b));
        swap(a, b);
    }

    // 方法有签名
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // 1. 方法名不同
    // 2. 参数列表不同[数据类型, 个数, 顺序]
    // 3. 返回值不影响重载
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a, b));

        double d1 = 12.5;
        double d2 = 22.3;
        System.out.println(add(d1, d2));
    }

    // 递不断在栈上开辟空间
    // 归从栈上的空间返回
    // 没有最后的返回值, 不断在栈上开辟空间, 栈上的空间已经被压缩了.
    public static int funFac(int n) {
        if (n == 1) {
            return 1;
        }
        int tmp = n * funFac(n - 1);
        return tmp;
    }

    public static void print(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        } else {
            print(n / 10);
            System.out.println(n % 10);
        }

    }

    public static int sum(int n) {
        int number;
        if (n == 1) {
            return 1;
        }
        number = n + sum(n - 1);
        return number;
    }

    public static int func(int n ) {
        if ( n < 10) {
            return n;
        }
        int tmp = func(n / 10) + n % 10;
        return tmp;
    }

    // 斐波那契数列
    public static int fibonaci(int n) {
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        int tmp =fibonaci(n - 1) + fibonaci(n - 2);
        return tmp;
    }
    public static void main33(String[] args) {
        int n = 5;
        int num = funFac(5);
    }

    public static int fib2(int n ) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int f3 = -1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        print(123);
    }
}
