package com.movieBackend.services.concretes;

import com.movieBackend.dtos.MovieGenreDto;
import com.movieBackend.entities.Genre;
import com.movieBackend.repositories.GenreRepository;
import com.movieBackend.services.abstracts.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public MovieGenreDto saveGenre(MovieGenreDto movieGenreDto) {
        Genre genre = new Genre();
        BeanUtils.copyProperties(movieGenreDto, genre);
        Genre updatedGenre = genreRepository.save(genre);
        MovieGenreDto responseDto = new MovieGenreDto();
        BeanUtils.copyProperties(updatedGenre, responseDto);
        return responseDto;
    }

}
