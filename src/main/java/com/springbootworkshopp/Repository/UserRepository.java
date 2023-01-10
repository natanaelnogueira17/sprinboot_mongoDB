package com.springbootworkshopp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springbootworkshopp.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
