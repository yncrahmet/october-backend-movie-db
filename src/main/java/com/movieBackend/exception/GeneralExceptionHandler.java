package com.movieBackend.exception;

import com.movieBackend.exception.movie.MovieNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(value = MovieNotFoundException.class)
    public ResponseEntity<ProblemDetails> handleMovieNotFoundException(MovieNotFoundException e, WebRequest request) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setPath(request.getDescription(false));
        problemDetails.setMessage(e.getMessage());
        problemDetails.setErrorCode(HttpStatus.NOT_FOUND);
        problemDetails.setLocalDate(LocalDateTime.now());
        return new ResponseEntity<>(problemDetails, HttpStatus.NOT_FOUND);
    }

}
