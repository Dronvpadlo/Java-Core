package HW2;


import HW2.Task1.Address;
import HW2.Task1.User;
import HW2.Task2.Laptop;
import HW2.Task2.PC;
import HW2.Task2.Ultrabook;
import HW2.Task2.Workstation;

public class Main {
    public static void main(String[] args) {
        //створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
        //https://jsonplaceholder.typicode.com/users/1
        Address address = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", "-37.3159","81.1496");
        User user1 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address, "1-770-736-8031 x56442", "hildegard.org", "Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
        System.out.println(user1);

        //Створити та описати наступну їєрархію
        //PC-Laptop-Ultrabook
        //PC-Laptop- Workstation
        //Загальна кількість вкористаних класів - 4!
        PC pc = new PC("Asus","AMD", 2.4, 8 );
        Laptop laptop = new Laptop("Acer", "Intel", 3.7, 16, 16.2, true);
        Ultrabook ultrabook = new Ultrabook("Lenovo", "AMD", 2.8, 8, 15, false, 1.7);
        Workstation workstation = new Workstation("Dell","Intel", 3.7, 16, 17.2, true, "Nvidia 3070TI", 8);
        System.out.println(pc + "}");
        System.out.println(laptop + "}");
        System.out.println(ultrabook);
        System.out.println(workstation);

        //Cтворити клас ланцюг наслідування:
        //Папірус-Кинга-Журнал
        //Папірус-Книга-Комікс
        //Кількість полів довільна.
        Book book = new Book("paper", "Smock Bellew", "Jack London", 126);
        Magazine magazine = new Magazine("paper", "How Wheels", "Unknown Author", 18, 4);
        Comic comic = new Comic("paper", "X-Men", "Marvel", 24, "John Romita");
        System.out.println(book+ "}");
        System.out.println(magazine);
        System.out.println(comic);


        //Створити клас котрий відповідає наступній моделі
        //{
        //    id: 1,
        //    name: 'vasya',
        //    surname: 'pupkin',
        //    email: 'asd@asd.com',
        //    age: 31,
        //    gender: 'MALE',
        //    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
        //    car: {model: 'toyota', year: 2021, power: 250}
        //}
        //Використати композицію/агрегацію та енуми в потрібному місці.
        //
        //
        //
        //***Additional***
        //Є об'єкти постів:
        //{
        //"userId": 1,
        //"id": 1,
        //"title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
        //"body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
        //},
        //{
        //"userId": 1,
        //"id": 2,
        //"title": "qui est esse",
        //"body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
        //},
        //{
        //"userId": 1,
        //"id": 3,
        //"title": "ea molestias quasi exercitationem repellat qui ipsa sit aut",
        //"body": "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"
        //}
        //
        //Є об'єкти коментарів до цих постів
        //{
        //"postId": 1,
        //"id": 1,
        //"name": "id labore ex et quam laborum",
        //"email": "Eliseo@gardner.biz",
        //"body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
        //},
        //{
        //"postId": 1,
        //"id": 2,
        //"name": "quo vero reiciendis velit similique earum",
        //"email": "Jayne_Kuhic@sydney.com",
        //"body": "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"
        //},
        //{
        //"postId": 1,
        //"id": 3,
        //"name": "odio adipisci rerum aut animi",
        //"email": "Nikita@garfield.biz",
        //"body": "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"
        //},
        //
        //{
        //"postId": 2,
        //"id": 7,
        //"name": "repellat consequatur praesentium vel minus molestias voluptatum",
        //"email": "Dallas@ole.me",
        //"body": "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"
        //},
        //{
        //"postId": 2,
        //"id": 8,
        //"name": "et omnis dolorem",
        //"email": "Mallory_Kunze@marie.org",
        //"body": "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"
        //}
        //
        //
        //{
        //"postId": 3,
        //"id": 13,
        //"name": "aut inventore non pariatur sit vitae voluptatem sapiente",
        //"email": "Kariane@jadyn.tv",
        //"body": "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"
        //},
        //{
        //"postId": 3,
        //"id": 14,
        //"name": "et officiis id praesentium hic aut ipsa dolorem repudiandae",
        //"email": "Nathan@solon.io",
        //"body": "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"
        //},
        //{
        //"postId": 3,
        //"id": 15,
        //"name": "debitis magnam hic odit aut ullam nostrum tenetur",
        //"email": "Maynard.Hodkiewicz@roberta.com",
        //"body": "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"
        //},
        //
        //Запакувати всі пости в список,всі коментарі в свій окремий список
        //Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
        //
        //В постах додатково потрібно додати поле яке характеризує список комментарів.
    }
}
