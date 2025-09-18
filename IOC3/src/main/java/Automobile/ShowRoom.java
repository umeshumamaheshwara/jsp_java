package Automobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowRoom {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = container.getBean(Car.class);
		car.Play();
	}

}
