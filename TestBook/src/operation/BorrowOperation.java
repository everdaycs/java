package operation;

import book.Booklist;

import book.Book;
import java.util.Scanner;

public class BorrowOperation implements IOPeration{
    @Override
    public void work(Booklist booklist) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入想要借阅的书");
        String name = scanner.nextLine();
        int currenSize = booklist.getUsedSize();
        int index = -1;
        for (int i = 0; i < currenSize; i++) {
            Book book = booklist.getBook(i);
            if (book.getName().equals(name)) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true);
                } else {
                    System.out.println("已被借出");
                    return;
                }
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("没有这本书");
        } else {
            System.out.println("成功借出");
        }
    }
}
