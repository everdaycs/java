package operation;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class FindOperation implements IOPeration{
    public void work(Booklist booklist) {
        System.out.println("查找图书");
        System.out.println("请输入你要查找的图书");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到了你查找的书");
                System.out.println(book);
                return;
            }
        }
        System.out.println("不好意思, 你好像没有这本书");
    }

}
