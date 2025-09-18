package Automobile;

import org.springframework.stereotype.Component;

@Component
public class Sony implements MusicSystem {
	public void Play()
	{
		System.out.println("Sony Music System");
	}
	

}
