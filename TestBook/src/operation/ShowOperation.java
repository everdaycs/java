package operation;
import book.Book;

import book.Booklist;

public class ShowOperation implements IOPeration{
    @Override
    public void work(Booklist booklist) {
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            System.out.println(book);
        }
        System.out.println("显示图书");
    }
}
