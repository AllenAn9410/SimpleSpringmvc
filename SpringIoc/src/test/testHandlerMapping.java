package test;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;

import allen.entity.User;
import allen.service.NameOrPwdException;
import allen.service.UserService;





public class testHandlerMapping {
	@Test
	public void testHandlerMapping(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		HandlerMapping hm = ac.getBean("handlerMapping",HandlerMapping.class);
		Properties map = ac.getBean("urlMappings",Properties.class);
		System.out.println(hm);
		System.out.println(map);
	}
	@Test
	public void testHelloController(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		Controller hc = ac.getBean("helloController",Controller.class);
		System.out.println(hc);
	}
	@Test
	public void testViewResolver(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		ViewResolver vr = ac.getBean("jspViewResolver",ViewResolver.class);
		System.out.println(vr);
	}
	@Test
	public void testUserService() throws NameOrPwdException{
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		UserService us = ac.getBean("userService",UserService.class);
		User user = us.login("allen", "allen");
		System.out.println(user);
	}
}
