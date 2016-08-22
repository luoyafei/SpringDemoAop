import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luo.bean.User;
import com.luo.service.AccountService;
import com.luo.service.UserService;

public class TestSpring {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		AccountService as = (AccountService)ac.getBean("as");
		as.getAccount();
		System.out.println("end");
	}
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService)ac.getBean("us");
		us.save(new User());
	}
	
	@Test
	public void isnull() {
	}
	
	@Before
	public void testReadOnlyBefore() {
		System.out.println("++++++++++++++++++" + System.currentTimeMillis() + "++++++++++++++++++");
	}
	
	@Test
	public void testReadOnly() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService)ac.getBean("us");
		us.getUserAll();
	}
	
	@After
	public void testReadOnlyAfter() {
		System.out.println("++++++++++++++++++" + System.currentTimeMillis() + "++++++++++++++++++");
	}
	
	@Test
	public void testMybatis() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		AccountService as = (AccountService)ac.getBean("as");
		as.getAccount();
		System.out.println("end");
		
	}
}

