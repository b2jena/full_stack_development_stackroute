package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {

    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
    private Map<Movie, Integer> movieMap;
    public MovieService() {
        movieMap = new LinkedHashMap<>();
    }

    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {
        return this.movieMap;
        //return null;
    }

    /*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
        //Set<Map.Entry<K,V>> entrySet()
        //Returns a Set view of the mappings contained in this map
        movieMap.put(movie, rating);
        return movieMap.entrySet();
        //return null;
    }

    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {
        List<String> ans = new LinkedList<>();
        for(Movie movie : movieMap.keySet()){  //for key part of movieMap
            if(movieMap.get(movie) >= rating){
                ans.add(movie.getMovieName());
            }
        }
        return ans;
        //return null;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {
        List<String> ans = new LinkedList<>();
        for(Movie movie : movieMap.keySet()){
            //
            if(movie.getGenre().contentEquals(genre)){
                ans.add(movie.getMovieName());
            }
        }
        return ans;
        //return null;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
   */

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
        List<String> ans = new LinkedList<>();  //it will contain default initial capacity -> 16 and load factor -> 0.75
        for(Movie movie : movieMap.keySet()){
            //
            if(movie.getReleaseDate().isAfter(releaseDate) && movieMap.get(movie)<=3){
                ans.add(movie.getMovieName());
            }
        }
        return ans;
        //return null;
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
        List<Movie> ans = new LinkedList<>();
        TreeSet<Movie> sortedMovieList = new TreeSet<>();  //TreeSet stored a single object in java.
        //TreeSet is sorted based on objects
        sortedMovieList.addAll(movieMap.keySet());  //add all these to List<Movie>
        //
        for(Movie movie : sortedMovieList){
            ans.add(movie);
        }
        return ans;
        //return null;
    }

    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating() {
        List list = new LinkedList(movieMap.entrySet());
        Collections.sort(list, new Comparator<>(){
                @Override
                public int compare(Object obj1, Object obj2){
                    return ((Comparable)((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
            }
        });

        HashMap ans = new LinkedHashMap();
        Iterator it = list.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();  //Map.Entry returns a collection-view of the map, whose elements are of this class
            ans.put(entry.getKey(), entry.getValue());  //key value pairs in hashmap (ans)
        }
        return ans;
        //return null;
    }
}
