package Cool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Baby {
	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(MyConfig.class);
		 IceCream icecream=container.getBean(IceCream.class);
		 icecream.call();
		
		
	}

}
