package com.movieBackend.controllers;

import com.movieBackend.dtos.MovieGenreDto;
import com.movieBackend.services.abstracts.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/genres")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<MovieGenreDto> saveGenre(@RequestBody MovieGenreDto movieGenreDto){
        MovieGenreDto responseDto = genreService.saveGenre(movieGenreDto);
        return ResponseEntity.ok(responseDto);
    }

}
