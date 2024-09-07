package HW1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Books
        Book[] books = new Book[5];
        books[0] = new Book("Black Obelisk", 288, "Erick Maria Remark", "Drama");
        books[1] = new Book("Martin Eden", 332, "Jack London", "Drama");
        books[2] = new Book("Hearts in Atlantic", 448, "Stephen King", "Scared");
        books[3] = new Book("The Great Gatsby", 195, "Francis Scott Fitzgerald", "Drama");
        books[4] = new Book("Horns", 376, "Joe Hill", "Scared");
        System.out.println(Arrays.toString(books));

        //Cars
        Car[] cars = new Car[5];
        cars[0] = new Car("Audi", 5000, 3.2, true);
        cars[1] = new Car("Honda", 4000, 5.4, false);
        cars[2] = new Car("Dodge", 4800, 3.0, false);
        cars[3] = new Car("McLaren", 6000, 5.8, true);
        cars[4] = new Car("Acura", 2000, 1.8, false);
        System.out.println(Arrays.toString(cars));

        //Dogs
        Dog dog1 = new Dog("Carter", 4, "Boxer");
        Dog dog2 = new Dog("Ashley", 2, "German Shepherd");
        Dog dog3 = new Dog("Eugenie", 1, "Poodle");
        Dog dog4 = new Dog("Rudie", 6, "Beagle");
        Dog dog5 = new Dog("Aaron", 3, "Alaskan Malamute");
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(dog1);
        arrayList.add(dog2);
        arrayList.add(dog3);
        arrayList.add(dog4);
        arrayList.add(dog5);
        System.out.println(arrayList);

        //Posts
        Post post1 = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1, 2, "qui est esse", "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1, 6, "dolorem eum magni eos aperiam quia", "ut aspernatur corporis harum nihil quis provident sequi\\nmollitia nobis aliquid molestiae\\nperspiciatis et ea nemo ab reprehenderit accusantium quas\\nvoluptate dolores velit et doloremque molestiae");
        Post post4 = new Post(2, 11, "et ea vero quia laudantium autem", "delectus reiciendis molestiae occaecati non minima eveniet qui voluptatibus\\naccusamus in eum beatae sit\\nvel qui neque voluptates ut commodi qui incidunt\\nut animi commodi");
        Post post5 = new Post(3, 27, "quasi id et eos tenetur aut quo autem", "eum sed dolores ipsam sint possimus debitis occaecati\\ndebitis qui qui et\\nut placeat enim earum aut odit facilis\\nconsequatur suscipit necessitatibus rerum sed inventore temporibus consequatur");
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);
        System.out.println(posts);
        }
    }
