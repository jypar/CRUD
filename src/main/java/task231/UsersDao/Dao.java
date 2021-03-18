package task231.UsersDao;

import task231.model.User;

import java.util.List;

public interface Dao {
    void add(User user);
    void update(User user);
    void remove(Long id);
    List<User> getUsers();
    User findById(Long id);
}
