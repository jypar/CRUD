package task231.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import task231.UsersDao.Dao;
import task231.model.User;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private  Dao dao;


    @Override
    public void add(User user) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
