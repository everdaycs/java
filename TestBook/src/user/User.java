package user;
import book.Booklist;
import operation.IOPeration;

public abstract class User {
    protected String name; // 姓名
    public IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, Booklist booklist) {
        ioPerations[choice].work(booklist);
    }
}
