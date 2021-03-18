package task231.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task231.UsersDao.Dao;
import task231.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceImpl implements UserService {

    @Autowired
    private Dao dao;

    @Override
    @Transactional
    public void add(User user) {
        dao.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {

        dao.update(user);
    }

    @Override
    @Transactional
    public void remove(Long id) {

        dao.remove(id);

    }

    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }

    @Override
    @Transactional
    public User findById(Long id) {
        return dao.findById(id);
    }
}
