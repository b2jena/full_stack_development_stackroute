package com.stackroute.collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTests {
    private static final String MESSAGE_ONE = "Movie properties are not set correctly in the constructor";
    private static final String MESSAGE_TWO = "Movie details returned by toString() are not correct";
    private static final String MESSAGE_THREE = "Movie should be of comparable type";
    private static final String MESSAGE_FOUR = "Release date should be in proper format";
    private Movie movie;
    private LocalDate releaseDate;

    @BeforeEach
    public void setUp() {
        releaseDate = LocalDate.of(1994, 8, 12);
        movie = new Movie(101, "Titanic", "Drama", releaseDate);
    }

    @AfterEach
    public void tearDown() {
        movie = null;
        releaseDate = null;
    }

    @Test
    public void givenValidMovieValuesWhenCreatedThenSetProperties() {
        assertEquals(101, movie.getMovieId(), MESSAGE_ONE);
        assertEquals("Titanic", movie.getMovieName(), MESSAGE_ONE);
        assertEquals("Drama", movie.getGenre(), MESSAGE_ONE);
        assertEquals(releaseDate, movie.getReleaseDate(), MESSAGE_ONE);
    }

    @Test
    public void givenInValidMovieReleaseDateValuesWhenCreatedThenThrowException() {
        assertThrows(DateTimeException.class, () -> {
            LocalDate releaseDate = LocalDate.of(1994, 18, 12);
            Movie movie = new Movie(101, "Titanic", "Drama", releaseDate);
        }, MESSAGE_FOUR);
    }

    @Test
    public void givenValidMovieDetailsThenReturnMovieDetails() {
        LocalDate releaseDate = LocalDate.of(1994, 8, 12);
        Movie movie = new Movie(101, "Titanic", "Drama", releaseDate);
        String details = movie.toString();
        assertTrue(details.contains("movieId=101, movieName=Titanic, genre=Drama"), MESSAGE_TWO);
        assertTrue(details.contains("releaseDate=1994-08-12"), MESSAGE_TWO);
    }

    @Test
    public void givenMovieClassThenShouldBeOfComparableType() {
        Assertions.assertTrue(Comparable.class.isAssignableFrom(Movie.class), MESSAGE_THREE);
    }
}
