package com.springbootworkshopp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springbootworkshopp.Repository.UserRepository;
import com.springbootworkshopp.domain.User;
@Configuration
public class instanciation implements CommandLineRunner{
	
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		repository.saveAll(Arrays.asList(maria, alex, bob));
	}

}
