package com.example.travelpet.api.service;

import com.example.travelpet.model.entity.Review;
import com.example.travelpet.model.entity.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long reviewId) {
        return reviewRepository.getReferenceById(reviewId);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }
//TODO:
    public Review updateReview(Long reviewId, Review review) {
        return null;
    }

    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
