package com.zxyj.dao;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zxyj.entity.Dustbin;
import com.zxyj.entity.User;

@Repository
public class DustbinDaoImpl extends HibernateDaoSupport implements DustbinDao{
   
    @Resource(name = "sessionFactory")
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    private Dustbin dustbin;
	public List<?> findAllDustbion() {
	
		List<User> dustbins = new ArrayList();
		dustbins=(List<User>) getHibernateTemplate().find( "from User");
		for(User s: dustbins) {
	    	   System.out.println(s.getPassword()+"----"+s.getUserName());
	       }
		System.out.println(dustbins.size());
		return    dustbins;
	}
}
