package Electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileShop {
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);
		Mobile mobile=container.getBean(Mobile.class);
		mobile.call();
		
		
	}

}
