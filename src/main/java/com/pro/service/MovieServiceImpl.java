package com.pro.service;

import com.pro.dao.MovieMapper;
import com.pro.domain.Movie;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;


    @Override
    public List<Movie> getMovies() {
        return movieMapper.selectMovies();
    }

    @Override
    public Movie getMovie(String movieid) {
        return movieMapper.selectMovie(movieid);
    }
}
