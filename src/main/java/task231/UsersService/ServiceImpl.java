package task231.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task231.UsersDao.Dao;
import task231.model.User;

import java.util.List;

@Service
@Component
public class ServiceImpl implements UserService {

    @Autowired
    private Dao dao;
    @Override
    public void add(User user) {
        dao.add(user);
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return dao.getUsers();
    }
}
