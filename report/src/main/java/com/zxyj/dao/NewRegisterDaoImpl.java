package com.zxyj.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zxyj.entity.NewRegister;

@Repository
public class NewRegisterDaoImpl extends HibernateDaoSupport implements NewRegisterDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory0(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public List<?> findRegNumForDay(int cur_Page,int pNumbers) {

		String sql = "select date_format(create_time, '%Y-%m-%d') day,  count(*) registerNum,sum(if( is_info='Y' ,1,0)) is_info,"
				+ "sum(if( is_real='P' ,1,0)) is_real from xts_user  group by day limit "
				+(cur_Page-1)*pNumbers +","+pNumbers;
		// Session session=sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Query query = null;
		query = session.createSQLQuery(sql);
		SQLQuery q = (SQLQuery) session.createSQLQuery(sql)
				.setResultTransformer(Transformers.aliasToBean(NewRegister.class));
		q.addScalar("registerNum", StandardBasicTypes.INTEGER).addScalar("day", StandardBasicTypes.DATE).addScalar("is_info", StandardBasicTypes.INTEGER).addScalar("is_real", StandardBasicTypes.INTEGER);

		List<NewRegister> list = q.list();
		/*System.out.println(list.size());
		for (NewRegister s : list) {
			System.out.println(s.getRegisterNum() + "----" + s.getDay());
		}*/
		session.close();
		return list;
	}

	@Override
	public List<?> findRegRowCount() {
		String sql = "select date_format(create_time, '%Y-%m-%d') day,  count(*) registerNum from xts_user  group by day  ";
		// Session session=sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		
		Query query = null;
		query = session.createSQLQuery(sql);
		SQLQuery q = (SQLQuery) session.createSQLQuery(sql)
				.setResultTransformer(Transformers.aliasToBean(NewRegister.class));
		q.addScalar("registerNum", StandardBasicTypes.INTEGER).addScalar("day", StandardBasicTypes.DATE);
		
		List<NewRegister> list = q.list();
		
		session.close();
		return list;
	}

}
