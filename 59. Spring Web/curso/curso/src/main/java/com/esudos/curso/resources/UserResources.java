package com.esudos.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esudos.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> getUser() {
        User user = new User(1L, "John", "john@email.com", "99999999", "password");
        return ResponseEntity.ok().body(user);
    }

}
