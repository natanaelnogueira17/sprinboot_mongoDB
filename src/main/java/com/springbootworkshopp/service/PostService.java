package com.springbootworkshopp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootworkshopp.Repository.PostRepository;
import com.springbootworkshopp.domain.Post;
import com.springbootworkshopp.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repository;



	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));

	}
	
	public List<Post>findByTitle(String text){
		return repository.findByTitleContainingIgnoreCase(text);
	}

}
