package com.pro.service;

import com.pro.domain.Movie;
import com.pro.domain.Showhall;
import com.pro.domain.Showmovie;
import com.pro.domain.Time;

import java.util.List;

public interface ShowhallService {
    List<Showhall> getShowhalls();
    Showhall getShowhall(int showid);
    List<Movie>getMovies();
    Movie getMovie(String movieid);
    List<Showmovie> getShowmovies(int showid);
    List<Showmovie> findShowmovies(String movieid);
    Time getTime(int timeid);

}
