package com.thymeleaf_task.thymeleaf_task;

import java.time.LocalTime;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String load()
	{
		return "demo.html";
	}
	
	@GetMapping("/otp")
	public String loadOtp(Model model)
	{
		int otp=new Random().nextInt(1000,10000);
		model.addAttribute("otp",otp);
		return "demo.html";
		
	}
	@GetMapping("/time")
	public String loadTime(Model model)
	{
		LocalTime time =  LocalTime.now();
		model.addAttribute("time",time);
		return "demo.html";
		
	}
	@GetMapping("/print")
	public String loadImage(@RequestParam String link , Model model  )
	{
		model.addAttribute("link" , link);
		return "demo.html";
	}

	
	@GetMapping("/circle")
	public String printCircle(@RequestParam int size , @RequestParam String color, Model model  )
	{
		model.addAttribute("color" ,color);
		model.addAttribute("size",size);
		return "demo.html";
	}
}
