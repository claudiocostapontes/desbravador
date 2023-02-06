package com.desbravadores.desbravar.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desbravadores.desbravar.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "tecnologia", "prejuizo", "projeto", "bancodedados");
		return ResponseEntity.ok().body(u);
		
	}
	
	
}
