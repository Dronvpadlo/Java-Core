package HW2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
        //https://jsonplaceholder.typicode.com/users/1
        User user1 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", "1-770-736-8031 x56442", "hildegard.org");
        Address address1 = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874" );
        Geo geo1 = new Geo("-37.3159", "81.1496");
        Company company1 = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets" );


        //Створити та описати наступну їєрархію
        //PC-Laptop-Ultrabook
        //PC-Laptop- Workstation
        //Загальна кількість вкористаних класів - 4!
        //
        //
        //Cтворити клас ланцюг наслідування:
        //Папірус-Кинга-Журнал
        //Папірус-Книга-Комікс
        //Кількість полів довільна.
        //
        //
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
