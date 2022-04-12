package com.example.restaurantReview.repositories;

import com.example.restaurantReview.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    boolean existsByPostcode(String postcode);
    boolean existsByName(String name);
    Optional<Restaurant> findByPostcode(String postcode);
}
