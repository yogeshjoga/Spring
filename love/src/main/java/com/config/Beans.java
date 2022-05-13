package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class Beans extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] arr = {Config.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr = {"/love/*"};
		return arr;
	}

}
