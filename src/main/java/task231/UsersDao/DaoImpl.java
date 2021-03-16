package task231.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import task231.model.User;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public  class DaoImpl implements Dao {

    @Autowired
    private EntityManager entityManager;


    public void add(User user) {
        entityManager.persist(user);
    }


    public List<User> getUsers() {

       return entityManager.createNativeQuery("from users",User.class).getResultList();

    }
}
