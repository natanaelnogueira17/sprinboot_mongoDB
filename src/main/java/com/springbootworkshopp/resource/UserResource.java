package com.springbootworkshopp.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootworkshopp.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping("/buscartodos")
	public ResponseEntity<List<User>> findAll(){
		User maria =  new User("1", "maria silva ", "maria@email");
		User alex = new User("2", "Alez Santos ", "alex@email");
		List<User> list =  new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
	
}
