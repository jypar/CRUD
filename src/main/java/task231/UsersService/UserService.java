package task231.UsersService;

import task231.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getUsers();
}
