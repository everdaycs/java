import java.util.Scanner;

public class HanoiTower {
    public static void hannoi(int n , char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + "----->" + c);
        }else {
            hannoi(n - 1, a, c, b);
            hannoi(1, a, b, c);
            hannoi(n - 1, b ,a ,c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        System.out.println("将A座上的" + left + "个盘子全部移动到C的步骤为：");
        hannoi(left, 'A', 'B', 'C');
    }
}
