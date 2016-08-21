package com.luo.dao.daoImpl;

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

}
