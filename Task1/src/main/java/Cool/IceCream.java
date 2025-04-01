package Cool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IceCream {
	
	@Autowired
	Flavor flavor;
	
	void call()
	{
		flavor.call();
	}

}
