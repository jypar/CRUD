package task231.UsersDao;

import task231.model.User;

import java.util.List;

public interface Dao {
    void add(User user);
    List<User> getUsers();
}
