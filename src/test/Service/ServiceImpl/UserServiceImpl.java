package test.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import test.Dao.PersonDao;
import test.Service.UserService;

/**
 * Created by Leith on 2017/2/8.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public boolean login(String username, String password) {
        Boolean login=personDao.loginCheck(username,password);
        if (login)
            return  true;
        else
            return false;
    }
}
