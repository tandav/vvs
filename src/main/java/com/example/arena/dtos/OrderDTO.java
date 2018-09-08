package com.example.arena.dtos;

public class OrderDTO {

    public Long user_id;
    public Long tour_id;

    public OrderDTO(Long user_id, Long tour_id) {
        this.user_id = user_id;
        this.tour_id = tour_id;
    }

    public OrderDTO() {
    }

}
