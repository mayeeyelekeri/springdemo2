package com.mine.springdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainPageController {
	
	@Value("${IP_ADDRESS:default - 0.0.0.0}")
	String ipAddress; 
	
	@GetMapping("/")
	public String index(Model model) {
		System.out.println("IP Address is " + ipAddress); 
		
		
		try {
			InetAddress myIP; 
            myIP = InetAddress.getLocalHost();
            model.addAttribute("myIP", myIP); 
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
		
		
		model.addAttribute("ip", ipAddress); 
		return "index"; 
	}

}
