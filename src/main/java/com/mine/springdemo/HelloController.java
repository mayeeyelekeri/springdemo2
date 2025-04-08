package com.mine.springdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
	@Value("${WELCOME_MESSAGE:def_value}")
	String welcomeMessage; 
	
    @GetMapping("/greeting")
	public String hello() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            welcomeMessage += " From host: " + ip;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return welcomeMessage;
    }
 
}