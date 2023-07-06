package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	// RESTful API's method
	@PostMapping("/user")
	public void insert(@RequestBody User user) {
		service.create(user);
	}

	@DeleteMapping("/user/{id}")
	public void remove(@PathVariable Long id) {
		service.delete(id);
	}

	@GetMapping("/user")
	public List<User> retrieveAll() {
		return service.retrieveAll();
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> retrieve(@RequestBody User user, @PathVariable Long id) {
		try {
			User u = service.retrieve(id);
			service.create(user);
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}