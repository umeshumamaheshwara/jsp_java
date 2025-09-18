package Automobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private MusicSystem musicSystem;
	
	@Autowired
	public void setMusicSystem(MusicSystem musicSystem)   // It is an example for Setter Injection
	{
		this.musicSystem = musicSystem;
	}
	
	void Play()
	{
		musicSystem.Play();
		
	}

}
