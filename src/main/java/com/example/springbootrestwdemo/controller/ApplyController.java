package com.example.springbootrestwdemo.controller;

import java.util.Date;
import java.util.HashMap;





import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springbootrestwdemo.model.User;


@Controller
@RequestMapping(path = "/cab")
public class ApplyController {

	static HashMap<String, User> users = new HashMap<String, User>();

@PostMapping("/book")	
	

	public String bookRide(@RequestParam String from, @RequestParam String to, @RequestParam String typeOfCab, Model model) { 
	//String TypeOfCab = "typeOfCab";	
    int toc =Integer.parseInt(typeOfCab);    
	
    
    User user = new User(to, from, toc);
		users.put(to, user);
		
		System.out.println("[ApplyController] User Input successfully: From "+user.getFrom()+" To "+user.getTo()+" with cab choice of "+user.gettoc());
		
		model.addAttribute("title", "Cab Choice of "+toc+" selected!!");
		model.addAttribute("message", "Destination to "+to+" !!Well Done at "+new Date());
		
        
		
		
		
		return "success";	
}


		

		
		
		






}
