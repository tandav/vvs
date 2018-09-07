package com.example.arena.repositories;

import com.example.arena.entities.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Long> {
}