package com.first.example.ReallyInSimpleWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ReallyInSimpleWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReallyInSimpleWayApplication.class, args);
	}

	@RestController
	class HelloController{
		@GetMapping("/")
		String Hello() {
			String str= "Java is a programming language and computing platform first released by Sun Microsystems in 1995. There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!";
			return str;
		}
	}
}
