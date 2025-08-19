package com.project.omkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync  //for faster email sending
public class OmkarApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(OmkarApplication.class, args);
	}

}
