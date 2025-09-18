package Electronics;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {
	
	public void call()
	{
		System.out.println("caling from Airtel Sim");
	}

}
