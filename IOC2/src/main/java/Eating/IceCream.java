package Eating;

import org.springframework.stereotype.Component;

@Component
public class IceCream {
	 
	Flavour flavour;
	
	public IceCream(Flavour flavour)   //It is an example for Constructor Injection
	{
		this.flavour = flavour;
	}
	
	void Buy()
	{
       flavour.Buy();
       
	}

}
