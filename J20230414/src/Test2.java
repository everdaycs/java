import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main9(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int z = 2;
        while (z != 0) {
            if (num1 < num2) {
                int tmp = 0;
                tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            z = num1 % num2;
            num1 = num2;
            num2 = z;
        }
       System.out.println(num1);
    }

    public static void main(String[] args) {
        int n = 7;
        for (int i = 30; i >= 0 ; i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println("");
        for (int i = 31; i >= 0; i -= 2) {
            System.out.print(((n >> i) & i) + " ");
        }
    }
    public static void main333(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num1 = num & 0xAAAAAAAA;
        int num2 = num & 0x55555555;
        System.out.println("Even" + Integer.toBinaryString(num1));
        System.out.println("Odd" + Integer.toBinaryString(num2));
    }
    public static void main25(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "hello";
        int count = 1;
        while (count <= 3) {
            String code = scan.nextLine();
            if (code.equals(password)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
                count++;
            }
        }
    }
    public static void main777(String[] args) {
        for (int i = 0; i < 99; i++) {
            int tmp = i;
            while (tmp != 0) {
                int num = tmp % 10;
                System.out.print(num + " ");
                tmp /= 10;
            }
            System.out.println();

        }
    }
    public static void main22(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    System.out.print("*");
                }
                else if (i == num - j -1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main13(String[] args) {
        Random random = new Random();
        int num = random.nextInt(101);
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == num) {
                System.out.println("找到了");
            }
            if (n < num) {
                System.out.println("找小了");
            }
            if (n > num) {
                System.out.println("找大了");
            }
        }
    }

    public static void main88(String[] args) {
        double sum1 = 0.0;
        double sum2 = 0.0;
        for (int i = 1; i <= 100; i = i + 2) {
            sum1 = sum1 + 1.0 / i;
        }
        for (int j = 2; j < 100; j = j + 2) {
            sum2 = sum2 + 1.0 / j;
        }
        double sum = sum1 - sum2;
        System.out.println(sum);
    }
    public static void main66(String[] args) {
        double sum = 0;
        int flag = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }

    public static void main10(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == 9) {
                    System.out.println(i);
                    break;
                }
                if (tmp / 10 == 9) {
                    System.out.println(i);
                    break;
                }
                tmp /= 10;
            }
        }
    }

    public static void main8(String[] args) {
        int n = -1;

        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main7(String[] args) {

        for (int i = 1; i <= 99999999; i++) {
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                tmp /= 10;
                count++;
            }
            tmp = i; //123
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void main2(String[] args) {
        int n = 1;
        int i = 2;
        for (n = 1; n <= 100; n++) {
            for (; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    break;
                }

            }
            // 有两个钟情况, 1. 不符合循环条件. 2. 遇到了break
            if (i > Math.sqrt(n)) {
                System.out.println(n + "是素数");
            }
        }


    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100); //[0,100) 直接输入100 就可以了
        while (true) {
            System.out.println("请输入你要猜的数字:");
            int num = scanner.nextInt();
            if (num < randNum) {
                System.out.println("猜小了");
            }
            if (num == randNum) {
                System.out.println("猜对了");
            }
            if (num > randNum) {
                System.out.println("猜大了");
            }
        }
    }
}