package com.movieBackend.dtos;

import com.movieBackend.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponseDto {

    private Integer id;

    private String title;

    private String description;

    private String director;

    private String genre;

    private Date releaseDate;

    private List<Integer> favoritedByUser;

    private Double imdb;

    private List<TrendMovieDTO> trendMovies;

    private List<String> cast;

    private Movie.MovieStatus status;

}
