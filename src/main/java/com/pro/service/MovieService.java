package com.pro.service;

import com.pro.domain.Movie;

import java.util.List;

public interface MovieService {
    List<Movie>getMovies();
    Movie getMovie(String movieid);
}
