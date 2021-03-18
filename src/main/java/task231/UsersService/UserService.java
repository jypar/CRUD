package task231.UsersService;

import task231.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void remove(Long id);
    List<User> getUsers();
    User findById(Long id);
}
