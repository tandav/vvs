package com.example.arena.controllers;

import java.util.List;
import java.util.stream.Collectors;

import com.example.arena.entities.User;
import com.example.arena.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {


    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
