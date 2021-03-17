package task231.UsersDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import task231.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Component
public  class DaoImpl implements Dao {

   @PersistenceContext(unitName = "entityManager")
   private EntityManager entityManager;

    public void add(User user) {
        entityManager.persist(user);
    }

    public List<User> getUsers() {

       return entityManager.createNativeQuery("select * from user").getResultList();

    }
}
