package com.jdbc_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLogic {
	public static void main(String[] args)throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAO studentDAO = context.getBean("studentDAO",StudentDAO.class);
		studentDAO.init();
		studentDAO.updateSql();
		studentDAO.destroy();
		context.close();
		/**
		 * this code working nicely wow wow
		 * read every code 
		 * don't skip single line also
		 * becoz you can learn lot of things by reading only
		 * read a lot codes like everyday news paper 
		 * okay it's better to you yogi
		 * motivate yourself my dear.
		 */
	}

}
