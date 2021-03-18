package task231;

import task231.UsersDao.DaoImpl;
import task231.model.User;

public class Main {

    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        dao.update(new User(2l,"gj","jg",".com"));
    }
}
