package com.mine.springdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainPageController {
	
	@Value("${IP_ADDRESS:default - 0.0.0.0}")
	String ipAddress; 
	
	@Value("${spring.application.name:default - SpringDemo}")
	String appName;
	
	@GetMapping("/")
	public String index(Model model) {
		System.out.println("inside MainPageController, IP Address from ENV: " + ipAddress); 
		
		try {
			InetAddress myIP = InetAddress.getLocalHost();
			System.out.println("system generated IP address: "+ myIP); 
            model.addAttribute("myIP", myIP); 
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
		
		// Send the following values back to view 
		model.addAttribute("ip", ipAddress); 
		model.addAttribute("appName", appName); 
		
		return "index"; 
	}

}
