package task231;

import org.springframework.beans.factory.annotation.Autowired;
import task231.Service.UserService;
import task231.Service.UserServiceImpl;
import task231.model.User;
import java.util.List;

public class Main {

    @Autowired
    private static UserService service;
    public static void main(String[] args) {

        /*service.add(new User("User1", "Lastname1", "user1@mail.ru"));
        service.add(new User("User2", "Lastname2", "user2@mail.ru"));
        service.add(new User("User3", "Lastname3", "user3@mail.ru"));
        service.add(new User("User4", "Lastname4", "user4@mail.ru"));*/

       List<User> list = service.getUsers();
        for (User user:list
             ) {
            System.out.println(user.getName());
        }
    }

}
