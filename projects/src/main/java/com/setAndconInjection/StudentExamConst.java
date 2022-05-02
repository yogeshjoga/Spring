package com.setAndconInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExamConst {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentConst studentConst = context.getBean("studentCon", StudentConst.class);
		studentConst.disply();
	}
}
