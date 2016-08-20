package com.luo.log;

//@Component
//@Aspect
public class LogInterceptor {

	
	/**
	 * execution(public void com.luo.dao.daoImpl.UserDaoImpl.save(com.luo.bean.User))
	 */
	//@Before("execution(public * com.luo.dao..*.*(..))")
	public void log() {
		System.out.println("log is log!");
	}
	
	//@After("execution(public void com.luo.dao.daoImpl.UserDaoImpl.save(com.luo.bean.User))")
	public void logAfter() {
		System.out.println("logafter is log!");
	}
}
