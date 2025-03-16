package com.movieBackend.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    private String description;

    @Column(name = "director", nullable = false)
    private String director;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "casts")
    private List<String> cast;


    private Double imdb;

    @JsonManagedReference
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<TrendMovie> trendMovies;

    @JsonManagedReference
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Reviews> reviews;

    public enum MovieStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
    @Enumerated(EnumType.STRING)
    private MovieStatus status;

    @ManyToOne
    private ActorOrDirector actorOrDirector;

}
