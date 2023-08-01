package operation;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class ReturnOperation implements IOPeration{
    @Override
    public void work(Booklist booklist) {
        System.out.println("归还图书!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入想要归还的书");
        String name = scanner.nextLine();
        int currenSize = booklist.getUsedSize();
        int index = -1;
        for (int i = 0; i < currenSize; i++) {
            Book book = booklist.getBook(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("没有需要归还书");
        }else {
            System.out.println("归还成功");
        }
    }
}
