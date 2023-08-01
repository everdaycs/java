package operation;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class DelOperation implements IOPeration{
    @Override
    public void work(Booklist booklist) {
        System.out.println("删除图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.nextLine();

        // 1. 找到要删除的书
        int currentSize = booklist.getUsedSize();

        if (currentSize == 1) {
            System.out.println("书架为空, 不能删除");
            return;
        }
        int index= -1;
        for (int i = 0;  i < currentSize; i++) {
            Book book1 = booklist.getBook(i);
            if (book1.getName().equals(name)) {
                index = i;
                break;
            }
        }
        // 2. index != -1
        if (index == -1) {
            System.out.println("没有这本书");
            return;
        }

        for (int i = index; i < currentSize -1; i++) {
            Book book1 = booklist.getBook(i+1);
            booklist.setBooks(i, book1);
            // 把i+ 1 位置上的书放到i的位置上
        }

        // 当书删掉之后, 需要维持usedSize
        booklist.setUsedSize(currentSize-1);
        // 这个是谁的属性, 调用什么对象, 调用对象中的方法 实现属性的变化


    }



}
