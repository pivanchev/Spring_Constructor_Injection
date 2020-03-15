package org.pivanchev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Square square = (Square)context.getBean("square");
		square.draw();
		
		((ConfigurableApplicationContext)context).close();


	}

}
