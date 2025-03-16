package com.movieBackend.services.abstracts;

import com.movieBackend.dtos.MovieGenreDto;

public interface GenreService {

    MovieGenreDto saveGenre(MovieGenreDto movieGenreDto);

}
