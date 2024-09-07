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
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("Carter", 4, "Boxer"));
        arrayList.add(new Dog("Ashley", 2, "German Shepherd"));
        arrayList.add(new Dog("Eugenie", 1, "Poodle"));
        arrayList.add(new Dog("Rudie", 6, "Beagle"));
        arrayList.add(new Dog("Aaron", 3, "Alaskan Malamute"));
        System.out.println(arrayList);

        //Posts
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 2, "qui est esse", "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla"));
        posts.add(new Post(1, 6, "dolorem eum magni eos aperiam quia", "ut aspernatur corporis harum nihil quis provident sequi\\nmollitia nobis aliquid molestiae\\nperspiciatis et ea nemo ab reprehenderit accusantium quas\\nvoluptate dolores velit et doloremque molestiae"));
        posts.add(new Post(2, 11, "et ea vero quia laudantium autem", "delectus reiciendis molestiae occaecati non minima eveniet qui voluptatibus\\naccusamus in eum beatae sit\\nvel qui neque voluptates ut commodi qui incidunt\\nut animi commodi"));
        posts.add(new Post(3, 27, "quasi id et eos tenetur aut quo autem", "eum sed dolores ipsam sint possimus debitis occaecati\\ndebitis qui qui et\\nut placeat enim earum aut odit facilis\\nconsequatur suscipit necessitatibus rerum sed inventore temporibus consequatur"));
        System.out.println(posts);

        //Comments
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1,1,"id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1,4, "alias odio sit", "Lew@alysha.tv", "non et atque\\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\\nquia voluptas consequuntur itaque dolor\\net qui rerum deleniti ut occaecati"));
        comments.add(new Comment(2,7, "repellat consequatur praesentium vel minus molestias voluptatum", "Dallas@ole.me", "maiores sed dolores similique labore et inventore et\\nquasi temporibus esse sunt id et\\neos voluptatem aliquam\\naliquid ratione corporis molestiae mollitia quia et magnam dolor"));
        comments.add(new Comment(3,11, "fugit labore quia mollitia quas deserunt nostrum sunt", "Veronica_Goodwin@timmothy.net", "ut dolorum nostrum id quia aut est\\nfuga est inventore vel eligendi explicabo quis consectetur\\naut occaecati repellat id natus quo est\\nut blanditiis quia ut vel ut maiores ea"));
        comments.add(new Comment(6,27,"doloribus quibusdam molestiae amet illum", "doloribus quibusdam molestiae amet illum", "nisi vel quas ut laborum ratione\\nrerum magni eum\\nunde et voluptatem saepe\\nvoluptas corporis modi amet ipsam eos saepe porro"));
        System.out.println(comments);
        }
    }
