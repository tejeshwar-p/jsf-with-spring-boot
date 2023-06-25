package com.jsf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsfWithSpringBootApplication {
	// I get the below error.
	/*j.e.resource.webcontainer.jsf.lifecycle  : JSF1027: [null] The ELResolvers for Faces were not registered with the Jakarta Server Pages container.*/
	// Did not find any way to fix this.
	// Application runs but does not show any page. However if no faces tags are used application runs fine with only
	// html tags.
	// Abandoning this project due to time constraints and will take it up later once I find any fix or any better
	// compatibility introduced by Spring and JSF community.

	public static void main(String[] args) {
		SpringApplication.run(JsfWithSpringBootApplication.class, args);
	}

}
