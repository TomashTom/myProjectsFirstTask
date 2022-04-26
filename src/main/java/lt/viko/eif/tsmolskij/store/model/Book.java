package lt.viko.eif.tsmolskij.store.model;

/**
 * <h1>Book</h1>
 * The Book class implements an application that
 * simply displays "Books" and attributes to the standard output.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-03-28
 */
public class Book {


    private int bookid;
    private String bookname;
    private String bookowner;
    private int year;
    private String booklocation;
    private String language;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return String.format("\n\tBook:\n\t%d - %s - %s - %s - %d - %s -  %.2f",
                bookid, bookname, bookowner, booklocation, year, language, price);
    }

    public int getYear() {
        return year;
    }

    public String getBooklocation() {
        return booklocation;
    }

    public String getBookowner() {
        return bookowner;
    }

    public String getBookname() {
        return bookname;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookowner(String bookowner) {
        this.bookowner = bookowner;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBooklocation(String booklocation) {
        this.booklocation = booklocation;
    }
}
