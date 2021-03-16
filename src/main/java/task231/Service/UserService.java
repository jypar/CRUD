package task231.Service;

import task231.model.User;

import java.util.List;

public interface UserService {

    void add(User user);
    List<User> getUsers();
}
