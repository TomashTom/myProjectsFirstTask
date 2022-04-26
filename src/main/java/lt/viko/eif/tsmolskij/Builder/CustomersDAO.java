package lt.viko.eif.tsmolskij.Builder;

import lt.viko.eif.tsmolskij.store.model.*;
/**
 * <h1>CostomersDAO</h1>
 * The CustoCostomersDAO class implements an application that
 * simply displays "CostomersDAO" and attributes to the standard output.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-04-10
 */
public class CustomersDAO {



    public Customers fetchStudentsData () {

        Customer first = new Customer();
        Customer second = new Customer();
        Customer third = new Customer();
        Customer fourth = new Customer();
        Customer fifth = new Customer();
        Customers Customers = new Customers();
        Videotape videotape= new Videotape();
        Films film = new Films();
        Book book = new Book();


        videotape.setVideotapeid(Integer.parseInt("01"));
        videotape.setVideotapename("World 1");
        videotape.setVideotapeowner("Johansone Krooze");
        videotape.setVideotapeyear(Integer.parseInt("1998"));
        videotape.setVideotapelanguage("Spanish");
        videotape.setVideotapeprice(Double.parseDouble("29.85"));

        videotape.setVideotapeid(Integer.parseInt("02"));
        videotape.setVideotapename("World 2");
        videotape.setVideotapeowner("Johansone Krooze");
        videotape.setVideotapeyear(Integer.parseInt("1998"));
        videotape.setVideotapelanguage("Spanish");
        videotape.setVideotapeprice(Double.parseDouble("29.85"));

        videotape.setVideotapeid(Integer.parseInt("03"));
        videotape.setVideotapename("World 3");
        videotape.setVideotapeowner("Johansone Krooze");
        videotape.setVideotapeyear(Integer.parseInt("1998"));
        videotape.setVideotapelanguage("Spanish");
        videotape.setVideotapeprice(Double.parseDouble("29.85"));

        videotape.setVideotapeid(Integer.parseInt("04"));
        videotape.setVideotapename("World 4");
        videotape.setVideotapeowner("Johansone Krooze");
        videotape.setVideotapeyear(Integer.parseInt("1998"));
        videotape.setVideotapelanguage("Spanish");
        videotape.setVideotapeprice(Double.parseDouble("29.85"));

        videotape.setVideotapeid(Integer.parseInt("05"));
        videotape.setVideotapename("World 5");
        videotape.setVideotapeowner("Johansone Krooze");
        videotape.setVideotapeyear(Integer.parseInt("1998"));
        videotape.setVideotapelanguage("Spanish");
        videotape.setVideotapeprice(Double.parseDouble("29.85"));

        book.setBookid(Integer.parseInt("1"));
        book.setBookname("Name1");
        book.setBookowner("Owner1");
        book.setPrice(Double.parseDouble("10.5"));
        book.setLanguage("Polish");
        book.setBooklocation("Poland");
        book.setYear(Integer.parseInt("2000"));

        book.setBookid(Integer.parseInt("2"));
        book.setBookname("Name2");
        book.setBookowner("Owner2");
        book.setPrice(Double.parseDouble("10.5"));
        book.setLanguage("Polish");
        book.setBooklocation("Poland");
        book.setYear(Integer.parseInt("2000"));

        book.setBookid(Integer.parseInt("3"));
        book.setBookname("Name3");
        book.setBookowner("Owner3");
        book.setPrice(Double.parseDouble("10.5"));
        book.setLanguage("Polish");
        book.setBooklocation("Poland");
        book.setYear(Integer.parseInt("2000"));

        book.setBookid(Integer.parseInt("4"));
        book.setBookname("Name4");
        book.setBookowner("Owner4");
        book.setPrice(Double.parseDouble("10.5"));
        book.setLanguage("Polish");
        book.setBooklocation("Poland");
        book.setYear(Integer.parseInt("2000"));

        book.setBookid(Integer.parseInt("5"));
        book.setBookname("Name5");
        book.setBookowner("Owner5");
        book.setPrice(Double.parseDouble("10.5"));
        book.setLanguage("Polish");
        book.setBooklocation("Poland");
        book.setYear(Integer.parseInt("2000"));


        film.setFilmkid(Integer.parseInt("1"));
        film.setFilmname("War");
        film.setFilmowner("Stiwen Albert");
        film.setLanguage("Polish");
        film.setFilmlocation("Poland");
        film.setYear(Integer.parseInt("2019"));

        film.setFilmkid(Integer.parseInt("10"));
        film.setFilmname("300 Spartance");
        film.setFilmowner("Stiwen Johanson");
        film.setLanguage("English");
        film.setFilmlocation("England");
        film.setYear(Integer.parseInt("2015"));

        film.setFilmkid(Integer.parseInt("15"));
        film.setFilmname("War 2");
        film.setFilmowner("Stiwen Albert");
        film.setLanguage("Polish");
        film.setFilmlocation("Poland");
        film.setYear(Integer.parseInt("2019"));

        film.setFilmkid(Integer.parseInt("100"));
        film.setFilmname("War 3");
        film.setFilmowner("Stiwen Albert");
        film.setLanguage("Polish");
        film.setFilmlocation("Poland");
        film.setYear(Integer.parseInt("2000"));

        film.setFilmkid(Integer.parseInt("18"));
        film.setFilmname("War 4");
        film.setFilmowner("Stiwen Albert");
        film.setLanguage("Polish");
        film.setFilmlocation("Poland");
        film.setYear(Integer.parseInt("2019"));






        first.setCusid(Integer.parseInt("11"));
        first.setCusmname("Jonas");
        first.setCussurname("Jonkutis");
        first.setCusphone("865289961");
        first.setCusaddress("Azolo g.1 ");
        first.setYear(Integer.parseInt("22"));

        second.setCusid(Integer.parseInt("15"));
        second.setCusmname("Jakub");
        second.setCussurname("Savickas");
        second.setCusphone("865289888");
        second.setCusaddress("Agotos g.8 ");
        second.setYear(Integer.parseInt("18"));

        third.setCusid(Integer.parseInt("150"));
        third.setCusmname("Jonas");
        third.setCussurname("Sudeika");
        third.setCusphone("8652898845");
        third.setCusaddress("Agotos g.10 ");
        third.setYear(Integer.parseInt("16"));

        fourth.setCusid(Integer.parseInt("19"));
        fourth.setCusmname("Tomasz");
        fourth.setCussurname("Smolnikas");
        fourth.setCusphone("865289999");
        fourth.setCusaddress("Jonazuoliu g.8 ");
        fourth.setYear(Integer.parseInt("15"));

        fifth.setCusid(Integer.parseInt("232"));
        fifth.setCusmname("Judgla");
        fifth.setCussurname("Stirna");
        fifth.setCusphone("865666666");
        fifth.setCusaddress("Linksmoji g.8 ");
        fifth.setYear(Integer.parseInt("25"));



        first.getBookList().add(book);
        second.getBookList().add(book);
        third.getBookList().add(book);
        fourth.getBookList().add(book);
        fifth.getBookList().add(book);

        first.getVideotapesList().add(videotape);
        second.getVideotapesList().add(videotape);
        third.getVideotapesList().add(videotape);
        fourth.getVideotapesList().add(videotape);
        fifth.getVideotapesList().add(videotape);

        first.getFilmsList().add(film);
        second.getFilmsList().add(film);
        third.getFilmsList().add(film);
        fourth.getFilmsList().add(film);
        fifth.getFilmsList().add(film);

        Customers.getCustomerList().add(first);
        Customers.getCustomerList().add(second);
        Customers.getCustomerList().add(third);
        Customers.getCustomerList().add(fourth);
        Customers.getCustomerList().add(fifth);







        return Customers;


    }


}
