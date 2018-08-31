package com.example.arena;

import com.example.arena.entities.User;
import com.example.arena.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(ApplicationArguments args) {

        // int[] a = new int[] {0, 1, 2, 3,4};

        for (int i = 10000; i < 10000 + 200; i++) {
            User temp_user = new User(Integer.toString(i));
            userRepository.save(temp_user);
        }

//        System.out.println("HELLO from run");
    }

}
