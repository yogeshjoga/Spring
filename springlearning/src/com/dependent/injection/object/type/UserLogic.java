package com.dependent.injection.object.type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLogic {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Student stud = context.getBean("studentOfObject", Student.class);
			stud.disPlay();
		}
}
