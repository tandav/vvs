package com.example.arena.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.example.arena.entities.Tour;
import com.example.arena.repositories.TourRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TourController {

    private TourRepository tourRepository;
    public TourController(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @GetMapping("/tours")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Tour> getAll() {
//    public List<Tour> getAll() {
//        Iterable<Tour> x = tourRepository.findAll();
//        System.out.println(x);
//        return x.s;
        return tourRepository.findAll();
    }

}
