## Problem Statement: Understanding HashMap and its methods ##

**Define Movie and MovieService class as given below**

**Movie Class**

Declare the following private properties 

    -movieId : int
    -movieName : String
    -genre : String
    -releaseDate : LocalDate

- Define parameterized constructor to initialize the above properties.
- Provide getter for all the properties
- Override the toString() method to return movie details
- Override the compareTo() method to compare against releaseDates

**MovieService Class has the following six methods** 

      +addKeyValuePairsToMap(Movie movie, Integer rating) : Set<Map.Entry<Movie, Integer>> 
      +getHigherRatedMovieNames(Map movieMap) : List<String>
      +getMovieNamesOfSpecificGenre(Map movieMap) : List<String>
      +getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(Map movieMap, LocalDate releaseDate) : List<String>
      +getSortedMovieListByReleaseDate(Map movieMap) : List<Movie>
      +getSortedMovieListByRating(Map movieMap) : Map<Movie, Integer>

- Follow the comments to complete the business logic for all six methods

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
