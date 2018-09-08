package com.example.arena.controllers;

import com.example.arena.dtos.OrderDTO;
import com.example.arena.dtos.UserDTO;
import com.example.arena.entities.User;
import com.example.arena.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    private UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserById(@PathVariable Long userId) {
        UserDTO x = new UserDTO(
            userRepository.findById(userId).get()
        );
        return new UserDTO(
            userRepository.findById(userId).get()
        );
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }



    public Iterable<User> deleteUser() {
        return userRepository.findAll();
    }

    @PatchMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long userId, @RequestBody UserDTO user_dto) {

        User user = userRepository.findById(userId).get();

        if (user_dto.first_name != null) {
            user.first_name = user_dto.first_name;
        }
        if (user_dto.last_name != null) {
            user.last_name = user_dto.last_name;
        }
        if (user_dto.email != null) {
            user.email = user_dto.email;
        }
        if (user_dto.password != null) {
            user.password = user_dto.password;
        }
        if (user_dto.birthday != null) {
            user.birthday = user_dto.birthday;
        }

        userRepository.save(user);
    }
}
