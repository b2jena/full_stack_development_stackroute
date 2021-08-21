package com.stackroute.collections;

import org.hamcrest.Matchers;
import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieServiceTests {
    private static final String MESSAGE = "Class MovieService has not been initialized with an empty HashMap properly";
    private static final String MESSAGE_ONE = "Key value pairs are not properly added to hashmap";
    private static final String MESSAGE_TWO = "Higher rated movies not returned properly";
    private static final String MESSAGE_THREE = "List of movie names of action genre not returned as expected";
    private static final String MESSAGE_FOUR = "List of movie names after specific date and rating lesser than three are not returned properly";
    private static final String MESSAGE_FIVE = "List of movies sorted by names are not returned properly";
    private static final String MESSAGE_SIX = "List of movie names sorted by rating in the ascending order is not returned properly";
    private static final String MESSAGE_SEVEN = " Specific Release date should be in proper format";
    private MovieService movieService;

    private Movie movieOne, movieTwo, movieThree;

    @BeforeEach
    public void setUp() {
        movieService = new MovieService();
    }

    @AfterEach
    public void tearDown() {
        movieService = null;
        movieOne = null;
        movieTwo = null;
        movieThree = null;
    }

    @Test
    public void givenMovieServiceThenMovieMapInitializedAsLinkedHashMap() {
        assertThat(MESSAGE, movieService, hasProperty("movieMap", instanceOf(LinkedHashMap.class)));
    }

    @Test
    public void givenMovieServiceWhenMovieAsKeyRatingAsValuePassedThenReturnMapEntry() {
        movieOne = new Movie(101, "Titanic", "Drama", LocalDate.of(1994, 8, 12));
        Set<Map.Entry<Movie, Integer>> movieEntrySet = movieService.addKeyValuePairsToMap(movieOne, 4);
        Map<Movie, Integer> movieMap = movieService.getMovieMap();
        assertThat(MESSAGE_ONE, movieEntrySet.size(), is(1));
        assertThat(MESSAGE_ONE, movieMap, IsMapContaining.hasEntry(movieOne, 4));
        assertThat(MESSAGE_ONE, movieMap, IsMapContaining.hasValue(4));
        assertThat(MESSAGE_ONE, movieMap, IsMapContaining.hasKey(movieOne));
    }

    @Test
    public void givenMovieServiceWhenMatchingForHigherRatingThenReturnMovieNamesList() {
        addMoviesToMap();
        List<String> movieNames = movieService.getHigherRatedMovieNames(4);
        Collections.sort(movieNames);
        assertThat(MESSAGE_TWO, movieNames, hasSize(2));
        assertThat(MESSAGE_TWO, movieNames, contains("Avengers The End Game", "Titanic"));
    }

    @Test
    public void givenMovieServiceWhenNonMatchingForHigherRatingThenReturnEmptyList() {
        movieOne = new Movie(103, "Spiderman", "Action", LocalDate.of(2001, 3, 1));
        movieService.getMovieMap().put(movieOne, 3);
        movieTwo = new Movie(104, "Only God Forgives", "Drama", LocalDate.of(2013, 10, 10));
        movieService.getMovieMap().put(movieTwo, 2);
        List<String> movieNames = movieService.getHigherRatedMovieNames(4);
        assertThat(MESSAGE_TWO, movieNames, hasSize(0));
    }

    @Test
    public void givenMovieServiceWhenMatchingThenReturnMovieNamesOfSpecificGenre() {
        addMoviesToMap();
        List<String> movieNames = movieService.getMovieNamesOfSpecificGenre("Action");
        Collections.sort(movieNames);
        assertThat(MESSAGE_THREE, movieNames, hasSize(2));
        assertThat(MESSAGE_THREE, movieNames, contains("Avengers The End Game", "Spiderman"));
    }

    @Test
    public void givenServiceWhenNonMatchingThenReturnEmptyList() {
        movieOne = new Movie(101, "Titanic", "Drama", LocalDate.of(1994, 8, 12));
        movieService.getMovieMap().put(movieOne, 4);
        movieTwo = new Movie(104, "Only God Forgives", "Drama", LocalDate.of(2013, 10, 10));
        movieService.getMovieMap().put(movieTwo, 2);
        List<String> movieNames = movieService.getMovieNamesOfSpecificGenre("Action");
        assertThat(MESSAGE_THREE, movieNames, hasSize(0));
    }

    @Test
    public void givenMovieServiceWhenMatchingThenReturnMovieNamesListAfterSpecificReleaseDateAndRatingLessThanThree() {
        LocalDate specificReleaseDate = LocalDate.of(2005, 1, 1);
        movieService.getMovieMap().put(new Movie(104, "Batman", "Action", LocalDate.of(2008, 9, 9)), 2);
        List<String> movieNames = movieService.getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(specificReleaseDate);
        assertThat(MESSAGE_FOUR, movieNames, hasSize(1));
        assertThat(MESSAGE_FOUR, movieNames, contains("Batman"));
    }

    @Test
    public void givenMovieServiceWhenNonMatchingThenReturnEmptyListAfterSpecificReleaseDateAndRatingLessThanThree() {
        addMoviesToMap();
        LocalDate specificReleaseDate = LocalDate.of(2005, 1, 1);
        List<String> movieNames = movieService.getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(specificReleaseDate);
        assertThat(MESSAGE_FOUR, movieNames, hasSize(0));
        assertTrue(movieNames.isEmpty(), MESSAGE_FOUR);
    }

    @Test
    public void giveMovieServiceWhenInvalidDatePassedThenThrowsException() {
        assertThrows(DateTimeException.class, () -> {
            LocalDate specificReleaseDate = LocalDate.of(2005, 16, 1);
            movieService.getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(specificReleaseDate);
        }, MESSAGE_SEVEN);
    }

    @Test
    public void givenMovieServiceThenReturnSortedMoviesListByReleasedDate() {
        addMoviesToMap();
        List<Movie> sortedMovieList = movieService.getSortedMovieListByReleaseDate();
        assertThat(MESSAGE_FIVE, sortedMovieList, hasSize(3));
        assertTrue(sortedMovieList.indexOf(movieOne) < sortedMovieList.indexOf(movieThree), MESSAGE_FIVE);
        assertTrue(sortedMovieList.indexOf(movieThree) < sortedMovieList.indexOf(movieTwo), MESSAGE_FIVE);
    }

    @Test
    public void givenMovieServiceWhenRatingsAreDifferentThenReturnSortedMoviesListByRating() {
        addMoviesToMap();
        Map<Movie, Integer> sortedMovieMap = movieService.getSortedMovieListByRating();
        assertThat(MESSAGE_SIX, sortedMovieMap.size(), is(3));
        assertThat(MESSAGE_SIX, sortedMovieMap.keySet(), Matchers.contains(movieThree, movieOne, movieTwo));
    }

    @Test
    public void givenMovieServiceWhenRatingsAreSameThenReturnMoviesListByNaturalOrder() {
        movieOne = new Movie(101, "Titanic", "Drama", LocalDate.of(1994, 8, 12));
        movieService.getMovieMap().put(movieOne, 4);
        movieTwo = new Movie(102, "Only God Forgives", "Drama", LocalDate.of(2013, 10, 10));
        movieService.getMovieMap().put(movieTwo, 4);
        Map<Movie, Integer> sortedMovieMap = movieService.getSortedMovieListByRating();
        assertThat(MESSAGE_SIX, sortedMovieMap.size(), is(2));
        assertThat(MESSAGE_SIX, sortedMovieMap.keySet(), Matchers.contains(movieOne, movieTwo));
    }

    /**
     * Setting up Movie data in MovieService for some Tests
     */
    private void addMoviesToMap() {
        movieOne = new Movie(101, "Titanic", "Drama", LocalDate.of(1994, 8, 12));
        movieTwo = new Movie(102, "Avengers The End Game", "Action", LocalDate.of(2019, 8, 10));
        movieThree = new Movie(103, "Spiderman", "Action", LocalDate.of(2001, 3, 1));
        movieService.getMovieMap().put(movieOne, 4);
        movieService.getMovieMap().put(movieTwo, 5);
        movieService.getMovieMap().put(movieThree, 3);
    }

}
