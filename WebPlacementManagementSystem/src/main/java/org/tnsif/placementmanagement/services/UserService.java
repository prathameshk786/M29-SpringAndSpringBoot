package org.tnsif.placementmanagement.services;

import java.util.List;

import org.tnsif.placementmanagement.entities.Student;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	
	//create and update
	public void create(User user) {
		repo.save(user);
	}
	
	//retrieve with specific ID
	public User retrieve(Long id) {
		return repo.findById(id).get();
	}
	
	//retrieve all records
	public List<User> retrieveAll() {
		return repo.findAll();
	}
	
	//delete with specific Id
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
