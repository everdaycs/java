package book;

public class Booklist {
    private Book[] books = new Book[10];
    private int usedSize; // 计数器 来记录 当前实际放的书的数目
    public Booklist() {
        this.books[0] = new Book("三国演艺","罗贯中", 10,"小说");
        this.books[1] = new Book("西游记","吴承恩", 10,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹", 10,"小说");
        this.usedSize = 3;
    }
    // 获取下标
    public Book getBook(int pos) {
        return books[pos];
    }

    // 往这个下标里面放东西
    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
