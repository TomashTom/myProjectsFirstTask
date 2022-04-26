package lt.viko.eif.tsmolskij.store.model;

import java.util.ArrayList;
import java.util.List;
/**
 * <h1>Customers</h1>
 * The Customers program implements an application that
 * simply displays "Customers" and attributes to the standard output.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-02-281
 */
public class Customer {

    private int cusid;
    private String cusmname;
    private String cussurname;
    private int year;
    private String cusphone;
    private String cusaddress;
    private List<Films> filmsList = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();
    private List<Videotape> videotapesList = new ArrayList<>();

    @Override
    public String toString() {

            return String.format("\nInformation:\n\tCustomer:\n\t%d - %s %s - %s - %d %s %s %s",
                    cusid, cusmname, cussurname, cusaddress,  year, printBook(), printFilms(), printviseotape() );


        }



    private String printBook(){
        String result = "";
        for(Book book : getBookList()){
            result+= String.format("\n\t\t%s", book);
        }
        return result;
    }
    private String printFilms(){
        String result = "";
        for(Films films : getFilmsList()){
            result+= String.format("\n\t\t%s", films);
        }
        return result;
    }
    private String printviseotape(){
        String result = "";
        for(Videotape videotape : getVideotapesList()){
            result+= String.format("\n\t\t%s", videotape);
        }
        return result;
    }


    public List<Book> getBookList() {
        return bookList;
    }



    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }


    public void setFilmsList(List<Films> filmsList) {
        this.filmsList = filmsList;
    }

    public void setVideotapesList(List<Videotape> videotapesList) {
        this.videotapesList = videotapesList;
    }

    public List<Films> getFilmsList() {
        return filmsList;
    }

    public List<Videotape> getVideotapesList() {
        return videotapesList;
    }

    public int getYear() {
        return year;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public void setCusmname(String cusmname) {
        this.cusmname = cusmname;
    }

    public void setCussurname(String cussurname) {
        this.cussurname = cussurname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCusaddress(String cusaddress) {
        this.cusaddress = cusaddress;
    }

    public void setCusphone(String cusphone) {
        this.cusphone = cusphone;
    }

    public int getCusid() {
        return cusid;
    }

    public String getCusmname() {
        return cusmname;
    }

    public String getCussurname() {
        return cussurname;
    }

    public int getYear(String s) {
        return year;
    }

    public String getCusaddress() {
        return cusaddress;
    }

    public String getCusphone() {
        return cusphone;
    }

    //private String cusphone;


}

