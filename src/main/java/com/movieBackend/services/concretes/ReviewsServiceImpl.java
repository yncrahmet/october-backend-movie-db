package com.movieBackend.services.concretes;

import com.movieBackend.dtos.DtoReviews;
import com.movieBackend.entities.Movie;
import com.movieBackend.entities.Reviews;
import com.movieBackend.entities.User;
import com.movieBackend.repositories.MovieRepository;
import com.movieBackend.repositories.ReviewsRepository;
import com.movieBackend.repositories.UserRepository;
import com.movieBackend.services.abstracts.IReviewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewsServiceImpl implements IReviewsService {

    private final ReviewsRepository reviewsRepository;
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    @Override
    public List<Reviews> getReviewsById(Integer movieId) {
        return reviewsRepository.findByMovieId(movieId);
    }

    @Override
    public DtoReviews createReview(DtoReviews dtoReview) {
        Movie movie = movieRepository.findById(dtoReview.getMovieId()).orElseThrow(() -> new RuntimeException("Movie not found!!!"));
        User user = userRepository.findById(dtoReview.getUserId()).orElseThrow(() -> new RuntimeException("User not found!!!"));
        Reviews review = new Reviews();
        BeanUtils.copyProperties(dtoReview, review);
        review.setMovie(movie);
        review.setUser(user);
        Reviews savedReviews =  reviewsRepository.save(review);
        DtoReviews dtoReviews = new DtoReviews();
        BeanUtils.copyProperties(savedReviews, dtoReviews);
        dtoReviews.setMovieId(movie.getId());
        dtoReviews.setUserId(user.getId());
        return dtoReview;
    }

    @Override
    public List<Reviews> getReviewsByUserId(Integer userId) {
        return reviewsRepository.findByUserId(userId);
    }

    @Override
    public List<Reviews> getReviewByMovieId(Integer movieId, String sort) {
        List<Reviews> reviews = reviewsRepository.findByMovieId(movieId);
        if ("date".equalsIgnoreCase(sort)) {
            reviews.sort(Comparator.comparing(Reviews::getCreatedAt));
        } else if ("rating".equalsIgnoreCase(sort)) {
            reviews.sort(Comparator.comparing(Reviews::getRating));
        }
        return reviews;
    }

}
