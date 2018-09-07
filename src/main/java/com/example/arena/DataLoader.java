package com.example.arena;

import com.example.arena.entities.Tour;
import com.example.arena.entities.User;
import com.example.arena.repositories.TourRepository;
import com.example.arena.repositories.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;
    private TourRepository tourRepository;
//    private OrderRepository orderRepository;

    public DataLoader(UserRepository userRepository, TourRepository tourRepository) {
        this.userRepository = userRepository;
        this.tourRepository = tourRepository;
//        this.orderRepository = orderRepository;
    }

    public void run(ApplicationArguments args) {

        // int[] a = new int[] {0, 1, 2, 3,4};

        for (int i = 10000; i < 10000 + 200; i++) {
            User temp = new User(Integer.toString(i));
            userRepository.save(temp);
        }

        for (int i = 10000; i < 10000 + 200; i++) {
            Tour temp = new Tour("name" + Integer.toString(i));
            tourRepository.save(temp);
        }

//        for (int i = 10000; i < 10000 + 200; i++) {
//            Order temp = new Order("n29");
//            orderRepository.save(temp);
//        }
//        System.out.println("HELLO from run");
    }

}
