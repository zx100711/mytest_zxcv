package com.zxyj.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zxyj.entity.User;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
   

    @Resource(name = "sessionFactory")
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

   
    public User find(String userName,String password){
     
        List<?> users = getHibernateTemplate().find("from User where userName=? and password=?",userName,password);
        return users.size()>0?(User)users.get(0):null;
    }
}
