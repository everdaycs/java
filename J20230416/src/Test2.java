public class Test2 {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static double max(double a, double b, double c) {
        return max(max(a,b), c);
    }
    public static void main45(String[] args) {
        int max1 = max(2,3);
        double max2 = max(2.3,5.7,1.3);
        System.out.println(max1);
        System.out.println(max2);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b, double c) {
        return a + b + c;
    }
    public static void main22(String[] args) {
        int num1 = add(3,5);
        double num2 = add(4.5,6.7,8.9);
        System.out.println(num1);
        System.out.println(num2);
    }


    public static int fibb(int n) {
        if (n == 1){
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int tmp = fibb(n - 1) + fibb(n - 2);
        return tmp;
    }

    public static int fac(int n) {
        if (n  == 1) {
            return 1;
        }
        return fac(n - 1) * n;
    }
    public static int facNum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }
    public static void main66(String[] args) {
        int num = fac(3);
        System.out.println(num);
        int number = facNum(3);
        System.out.println(number);
        int fibnici = fibb(6);
        System.out.println(fibnici);
    }
    public static int max2(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static int max3(int a, int b, int c) {
        int maxAB = max2(a,b);
        return max2(maxAB, c);
    }
    public static void main11(String[] args) {
        int a = 5;
        int b = 4;
        int c = 9;
        int max = max3(a, b,c);
        System.out.println(max);
    }
    public static void main6(String[] args) {
        int[] array1 = {1,2,3,4};
        /*System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);*/
//        System.out.println(array1[4]); // java 中所有的数组越界都会跟你说报错的.
        // 异常
        // 1. 算数异常
        // 2. 数组越界异常  ArrayIndexOutOfBoundsException.
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // for each 循环, 增强for循环
        // 区别 下标的区别 一个有 一个无
        for (int x : array1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // 数组的定义与使用
    public static void main2(String[] args) {
        char[] array = new char[10];

        double[] array2 = new double[10];

        boolean[] array3 = new boolean[10];

        String[] array4 = new String[10];
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};

        int[] array2 = new int[10]; // 定义了一个大小为10 的整形数组

        int[] array3 = new int[]{1,2,3,4,5,6,7}; // 这样写[]里面不能有数字, 会根据有多少数字, 推导出[]里面需要多少

        System.out.println(array); // 可以理解为地址 但不是真正的地址, 只是一个哈希值
        System.out.println(array2);
        System.out.println(array3);
        // 内存放到堆上
        int[] array4;
        array4 = new int[10];
        int[] array5;
        array5 = new int[]{1,2,3,4,5};
    }
}
