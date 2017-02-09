package test.Dao.DaoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import test.Dao.PersonDao;
import test.Entity.PersonEntity;

import java.util.List;

/**
 * Created by Leith on 2017/2/8.
 */
public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {
    @Override
    public boolean loginCheck(String username, String password) {
        if(username==null)
            username="";
        if(password==null)
            password="";

        List<PersonEntity> list=null;
        //String sql="select a.username,a.password from person as  a where a.username='"+username+"' and a.password='"+password+"'";
        String hql="select user.username ,user.password from PersonEntity as user where user.username='"+username+"' and user.password = '"+password+"'";
        try {
            Session session = getHibernateTemplate().getSessionFactory().openSession();
            Query query =session.createQuery(hql);
           // System.out.println("@@@@@@@@@");
            list = query.list();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }


        if (!list.isEmpty())
            return true;
        else
            return false;
    }
}
