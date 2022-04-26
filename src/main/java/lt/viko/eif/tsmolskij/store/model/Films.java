package lt.viko.eif.tsmolskij.store.model;
/**
 * <h1>Films</h1>
 * The Films program implements an application that
 * simply displays "Films" to the standard output.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-02-28
 */
public class Films {

    private int filmkid;
    private String filmname;
    private String filmowner;
    private int year;
    private String filmlocation;
    private String language;


    @Override
    public String toString() {
        return String.format("\n\tFilm:\n\t%d - %s - %s - %d - %s - %s ",
                filmkid, filmname, filmowner, year, filmlocation, language);
    }

    public void setFilmkid(int filmkid) {
        this.filmkid = filmkid;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public void setFilmowner(String filmowner) {
        this.filmowner = filmowner;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFilmlocation(String filmlocation) {
        this.filmlocation = filmlocation;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFilmkid() {
        return filmkid;
    }

    public String getFilmname() {
        return filmname;
    }

    public String getFilmowner() {
        return filmowner;
    }

    public int getYear() {
        return year;
    }

    public String getFilmlocation() {
        return filmlocation;
    }

    public String getLanguage() {
        return language;
    }
}
