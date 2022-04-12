package com.example.restaurantReview.repositories;

import com.example.restaurantReview.model.AdminReviewStatus;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<restaurantReview, Long> {
    Iterable<restaurantReview> findByIdAndAdminReviewStatus(Long id, AdminReviewStatus status);
    Iterable<restaurantReview> findByAdminReviewStatus(AdminReviewStatus pending);
}
