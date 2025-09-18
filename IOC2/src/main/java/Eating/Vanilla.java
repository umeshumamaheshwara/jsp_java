package Eating;

import org.springframework.stereotype.Controller;

@Controller
public class Vanilla implements Flavour {
	
	public void Buy()
	{
		System.out.println("Vanilla Flavour...");
	}
	

}
