import book.Booklist;
import user.AdiminUser;
import user.NomalUser;

import java.util.Scanner;
import user.User;
public class Main {


    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份: 1-> 管理员 2-> 普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            AdiminUser adiminUser = new AdiminUser(name);
            return adiminUser;
        }else {
            NomalUser nomalUser = new NomalUser(name);
            return nomalUser;
        }
    }
    public static void main(String[] args) {
        Booklist booklist = new Booklist();

        User user = login();
        while (true) {
            int choice = user.menu();
            // User 是哪个对象?
            // 能够确定哪个对象的哪个方法
            // 通过这两个变量 可以确定了 但是怎么联系起来
            /**
             * 1. 先让双方 存好 对应自己的操作
             * 2. 调用对应的操作
             */
            user.doOperation(choice, booklist);
        }
    }
}
