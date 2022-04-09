package com.mySpringProject.restaurantReview.repository;

import com.mySpringProject.restaurantReview.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByDisplayName(String displayName);
}
