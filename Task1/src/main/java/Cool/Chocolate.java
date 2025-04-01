package Cool;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chocolate implements Flavor {

	public void call() {
		System.out.println("Getting chacolate From Flavor");
		
	}
	
	
	

}
