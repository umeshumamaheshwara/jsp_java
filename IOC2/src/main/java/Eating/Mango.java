package Eating;

import org.springframework.stereotype.Controller;

@Controller
public class Mango implements Flavour{
	public void Buy()
	{
		System.out.println("Mango Flaour");
	}

}
