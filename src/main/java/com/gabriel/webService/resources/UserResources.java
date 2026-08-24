package com.gabriel.webService.resources;

import com.gabriel.webService.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User testUser = new User(1L, "Gabriel", "gabriel@example.com", "123456789", "987654321");
        return ResponseEntity.ok().body(testUser);
    }
}
