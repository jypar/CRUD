package task231.UsersDao;
import org.springframework.stereotype.Repository;
import task231.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public  class DaoImpl implements Dao {

   @PersistenceContext(unitName = "em")
   private EntityManager entityManager;

   @Override
   public void add(User user) {

       entityManager.persist(user);
   }

    @Override
    public void update(User user) {
       entityManager.merge(user);
   }

   @Override
   public void remove(Long id) {
        Query q = entityManager.createQuery("delete from User u where  u.id=:id");
        q.setParameter("id",id);
        q.executeUpdate();
   }

   @Override
   public List<User> getUsers() {
       return entityManager.createQuery("select u from User u").getResultList();
   }

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class,id);
    }

}
