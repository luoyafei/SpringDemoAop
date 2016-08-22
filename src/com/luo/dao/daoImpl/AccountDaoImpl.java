package com.luo.dao.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import com.luo.bean.User;
import com.luo.dao.AccountDao;

//@Component(value="ad")
public class AccountDaoImpl implements AccountDao {

	private SqlSessionFactoryBean sqlSessionFactoryBean;
	
	public SqlSessionFactoryBean getSqlSessionFactoryBean() {
		return sqlSessionFactoryBean;
	}

	//@Resource(name="sqlSessionFactoryBean")
	public void setSqlSessionFactoryBean(SqlSessionFactoryBean sqlSessionFactoryBean) {
		this.sqlSessionFactoryBean = sqlSessionFactoryBean;
	}

	
	@Override
	public void save() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getAccount() {
		// TODO Auto-generated method stub
		try {
			SqlSessionFactory ssf = sqlSessionFactoryBean.getObject();
			SqlSession session = ssf.openSession();
			List<User> users = session.selectList("com.luo.bean.User.allList");
			System.out.println(users.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
