package com.example.Springboottst;

import com.example.Springboottst.Entity.Userentity;
import com.example.Springboottst.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottstApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringboottstApplication.class, args);
	}

}