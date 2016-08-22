package com.luo.dao.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.luo.bean.User;
import com.luo.dao.UserDao;

@Component(value="ud")
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/*public DataSource getDataSource() {
		return dataSource;
	}

	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
*/
	@Override
	public void save(User user) {
		
System.out.println(sessionFactory.isClosed());
		
		Session session = sessionFactory.getCurrentSession();
	
		user.setName("王麻子5");
		session.save(user);

		throw new HibernateException("error");
		//System.out.println("I am saved!");
	}
	@SuppressWarnings("unchecked")
	@Override
	public void getUserAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User u";
		List<User> us = session.createQuery(hql).list();
		System.out.println(us.size());
		
	}

}
