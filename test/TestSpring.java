import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luo.bean.User;
import com.luo.dao.UserDao;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserDao ud = (UserDao)ac.getBean("ud");
		ud.save(new User());
		
	}
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserDao ud = (UserDao)ac.getBean("ud");
		ud.save(new User());
	}
	
	@Test
	public void isnull() {
	}
}