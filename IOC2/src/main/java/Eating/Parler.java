package Eating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Parler {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);
		IceCream Ice= container.getBean(IceCream.class);
		Ice.Buy();
		
	}

}
