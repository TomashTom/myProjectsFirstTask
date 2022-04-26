package lt.viko.eif.tsmolskij.store.model;
/**
 * <h1>Videotape</h1>
 * The Videopate program implements an application that
 * simply displays "Videotape" to the standard output.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-02-28
 */
public class Videotape {
    private int videotapeid;
    private String videotapename;
    private String videotapeowner;
    private int videotapeyear;
    private String videotapelanguage;
    private double videotapeprice;

    @Override
    public String toString() {
        /**
         * This method returns the formatted string by given locale, format and arguments
         * @see videotapeid
         * @see videotapelanguage
         * @see videotapename
         * @see videotapeowner
         *
         */
        return String.format("\n\tVideotape:\n\t%d - %s - %s - %d - %s - %.2f ",
                videotapeid, videotapename, videotapeowner, videotapeyear, videotapelanguage, videotapeprice);
    }



    public void setVideotapeid(int videotapeid) {
        this.videotapeid = videotapeid;
    }



    public void setVideotapeowner(String videotapeowner) {
        this.videotapeowner = videotapeowner;
    }

    public void setVideotapeyear(int videotapeyear) {
        this.videotapeyear = videotapeyear;
    }

    public void setVideotapelanguage(String videotapelanguage) {
        this.videotapelanguage = videotapelanguage;
    }

    public void setVideotapeprice(double videotapeprice) {
        this.videotapeprice = videotapeprice;
    }

    public int getVideotapeid() {
        return videotapeid;
    }

    public void setVideotapename(String videotapename) {
        this.videotapename = videotapename;
    }

    public String getVideotapename() {
        return videotapename;
    }

    public String getVideotapeowner() {
        return videotapeowner;
    }

    public int getVideotapeyear() {
        return videotapeyear;
    }

    public String getVideotapelanguage() {
        return videotapelanguage;
    }

    public double getVideotapeprice() {
        return videotapeprice;
    }


}
