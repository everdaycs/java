package operation;

import book.Booklist;

import java.util.Scanner;
import book.Book;
public class AddOperation implements IOPeration{
    public void work(Booklist booklist) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名:");
        String name = scanner.nextLine();
        System.out.println("请输入作者:");
        String author = scanner.nextLine();
        System.out.println("请输入价格:");
        int  price = scanner.nextInt(); // 不会读取\n \n留下了
        scanner.nextLine();
        System.out.println("请输入类型:");
        String type = scanner.nextLine();

        Book book = new Book(name, author, price, type);
        int currentSize = booklist.getUsedSize();

        for (int i = 0;  i < currentSize; i++) {
            Book book1 = booklist.getBook(i);
            if (book1.getName().equals(name)) {
                System.out.println("书架存在这种书, 不能进行添加");
                return;
            }
        }

        // 下标是从0开始的
        // 默认是放到了数组的最后位置
        booklist.setBooks(currentSize, book);

        booklist.setUsedSize(currentSize+1);
    }
}
