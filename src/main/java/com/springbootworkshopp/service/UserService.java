package com.springbootworkshopp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootworkshopp.Repository.UserRepository;
import com.springbootworkshopp.domain.User;
import com.springbootworkshopp.dto.UserDTO;
import com.springbootworkshopp.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	
	
	public List<User>findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto nao encontrado"));
		
	}
	
	public User insert (User obj) {
		return repository.insert(obj);
		
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

}
