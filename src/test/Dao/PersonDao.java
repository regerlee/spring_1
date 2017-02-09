package test.Dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by Leith on 2017/2/8.
 */
public interface PersonDao{
    public boolean loginCheck(String username,String password);
}
