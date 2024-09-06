package HW1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthors("Erick Maria Remark");
        book1.setGenre("Drama");
        book1.setTitle("Black Obelisk");
        book1.setPages(288);

        Book book2 = new Book();
        book2.setAuthors("Jack London");
        book2.setGenre("Drama");
        book2.setTitle("Martin Eden");
        book2.setPages(332);

        Book book3 = new Book();
        book3.setAuthors("Stephen King");
        book3.setGenre("Scared");
        book3.setTitle("Hearts in Atlantic");
        book3.setPages(448);

        Book book4 = new Book();
        book4.setAuthors("Francis Scott Fitzgerald");
        book4.setGenre("Drama");
        book4.setTitle("Big Getsbi");
        book4.setPages(195);

        Book book5 = new Book();
        book5.setAuthors("Joe Hill");
        book5.setGenre("Scared");
        book5.setTitle("Horns");
        book5.setPages(376);

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        System.out.println(Arrays.toString(books));
        }
    }
