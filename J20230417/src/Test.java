import java.util.Arrays;

public class Test {
    public static void bubblsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = true;
            for (int j = 1; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = false;
                }
            }
            if (flg == true) {
                break;
            }
        }
    }
    public static int findVal(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,144,657,213};
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(binarySearch(array, 14));
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = new int[array.length*2];
        //               源数组     开始位置      目标数组   开始位置   长度
        System.arraycopy(array,0,copy,0,array.length);
        System.out.println(Arrays.toString(copy));
    }
    public static void main21(String[] args) {
        int[] array = {1,2,3,4,5};
                //
        //copy = Arrays.copyOf(array, array.length);
        int[] copy = Arrays.copyOf(array, array.length*2); // 在后面补0;
        System.out.println(Arrays.toString(copy));
        // 能拷贝多少, 拷贝多少
        int[] copy2 = Arrays.copyOfRange(array,1,3); // 左闭右开 [1,3)
        System.out.println(Arrays.toString(copy2));
    }
    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i < array.length - 1) {
                ret += ',';
            }
        }
        ret += "]";
        return ret;
    }

    public static void main45(String[] args) {
        int[] array = {1,2,3,4,5};
        int a = 10;
        // java 中可以是一个变量
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        System.out.println(Arrays.toString(copy));


        int[] array2 = {1,2,3,4,5};
        int[] array3 = array2;
        // 这个肯定不是拷贝啊
        System.out.println(Arrays.toString(array3));
        /*String ret = myToString(array);
        System.out.println(ret);*/

    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < key) {
                left = mid + 1;
            } else if(array[mid] > key) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void mainee(String[] args) {
        int[] array = {1,2,13,4,15};
        Arrays.sort(array);
    }
    public static int[] func3() {
        /*int[] array = {1,2,3,4,5,6};
        return array;*/
        return new int[] {1,2,3,4,5};
    }
    public static void main22(String[] args) {
        int[] ret = func3();
       /* for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i] + " ");
        }*/
        // 借助工具类 将参数的数组 转化为字符串输出
        String s = Arrays.toString(ret); // ctrl + 鼠标点击
        System.out.println(s);

        System.out.println(Arrays.toString(ret));
    }
    // 内存是需要划分的
    // JVM的内存划分 方法区 虚拟机栈, 本地方法栈, 堆, 程序计数器
    //             Method Area  VM Stack  Native Method Stack  Heap  Program Counter Register
    // 堆: 一般用来存储对象的,
    // 每一块内存都有自己的使命, 不一样的内存 放的数据就是不一样的.
    // 内存是一段连续的存储空间

    // 数据类型
    // 1. 基本数据类型 八种
    // short int long double float boolean char byte
    // 基本变量 变量空间中直接存放的是其所应有的值.

    // 引用数据类型
    // 当前这个变量 里面存储的是地址
    // 引用变量, 其空间存储的是对象所存在的地址.

    public static void func1(int[] array) {
        array = new int[10];
    }

    public static void func2(int[] array) {
        array[0] = 99;
    }
    public static void main2(String[] args) {

        int[] array1 = {1,2,3,4};
        func1(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = {1,2,3,4};
        func2(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
        System.out.println();



        // 这是一个引用 , 引用了在对上存放的{1,2,3,4}
        // 两个引用同时指向了一个对象.
        // array2 这个引用指向了array1这个引用所指向的对象

        // 代表array3 这个引用, 不指向任何对象
        /*int array3[] = null;
        System.out.println(array3.length);*/
        // 以后遇到空指针异常, 一定要引用
    }
}
