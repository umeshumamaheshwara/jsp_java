package Electronics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	Sim sim;    //It is an example for Field Injection
	
	void call()
	{
		sim.call();
	}

}
