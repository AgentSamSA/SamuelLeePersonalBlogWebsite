package org.PersonalBlogApp.PersonalBlogBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@SpringBootApplication
public class PersonalBlogBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalBlogBackendApplication.class, args);
	}

}
