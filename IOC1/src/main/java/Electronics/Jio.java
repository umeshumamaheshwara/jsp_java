package Electronics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Jio implements Sim{
	
	public void call()
	{
		System.out.println("Calling From Jio");
		
	}


}
