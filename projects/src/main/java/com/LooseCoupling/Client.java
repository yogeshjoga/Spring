package com.LooseCoupling;

import java.nio.channels.NonWritableChannelException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Student student = context.getBean("std",Student.class);
			student.disply();
		}
}
