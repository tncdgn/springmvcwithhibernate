package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tunç on 26.7.2015.
 */
@Repository
public class UserDaoImp implements UserDao {

    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;

    }

    @Override
    public void addUser(User user) {
        Session session=this.sessionFactory.getCurrentSession();
        session.persist(user);

    }

    @Override
    public List<User> getAllUser() {
        Session session=this.sessionFactory.getCurrentSession();
        List list=session.createQuery("from User").list();
        return list;

    }

    @Override
    public void deleteUser(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        User user=(User)session.load(User.class,new Integer(id));
        if(user!=null){
            session.delete(user);
        }
    }

    @Override
    public void updateUser(User user) {
        Session session=this.sessionFactory.getCurrentSession();
        session.update(user);
    }
}
