package Eating;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Primary
@Controller
public class choclate implements Flavour 
{
	public void Buy()
	{
		System.out.println("Chocolate Flaour");
	}

}
