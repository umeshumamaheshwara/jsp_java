package Automobile;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JBL implements MusicSystem {
		
	
	public void Play()
	{
		System.out.println("JBL Music System....");
	}

}
