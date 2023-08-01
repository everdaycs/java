package operation;

import book.Book;
import book.Booklist;

public class ExitOperation implements IOPeration{
    @Override
    public void work(Booklist booklist) {
        System.out.println("退出系统!");
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            booklist.setBooks(i, null);
        }
        booklist.setUsedSize(0);
        System.exit(0);
    }
}
