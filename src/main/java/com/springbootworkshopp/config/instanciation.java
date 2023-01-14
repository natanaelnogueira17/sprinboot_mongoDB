package com.springbootworkshopp.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springbootworkshopp.Repository.PostRepository;
import com.springbootworkshopp.Repository.UserRepository;
import com.springbootworkshopp.domain.Post;
import com.springbootworkshopp.domain.User;
import com.springbootworkshopp.dto.AuthorDTO;
@Configuration
public class instanciation implements CommandLineRunner{
	
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		repository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		repository.saveAll(Arrays.asList(maria, alex, bob));
	
		Post post1 = new Post(null, sdf.parse("21/03/2022"), "Partiu viagem", "vou viajar pra SP!", new AuthorDTO(alex));
		Post post2 = new Post(null, sdf.parse("22/03/2022"), "bom dia ", "Que Lugar linda", new AuthorDTO(maria));
		
		
		postRepository.saveAll(Arrays.asList(post1,post2));
		
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		repository.save(maria);
	}
	
	

}
