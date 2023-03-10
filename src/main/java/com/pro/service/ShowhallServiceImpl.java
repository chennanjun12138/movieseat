package com.pro.service;

import com.pro.dao.MovieMapper;
import com.pro.dao.ShowhallMapper;
import com.pro.dao.ShowmovieMapper;
import com.pro.dao.TimeMapper;
import com.pro.domain.Movie;
import com.pro.domain.Showhall;
import com.pro.domain.Showmovie;
import com.pro.domain.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ShowhallServiceImpl implements ShowhallService {

    @Autowired
    private ShowhallMapper showhallMapper;
    @Autowired
    public MovieMapper movieMapper;
    @Autowired
    private ShowmovieMapper showmovieMapper;
    @Autowired
    private TimeMapper timeMapper;
    @Override
    public Time getTime(int timeid)
    {
        return timeMapper.selectTime(timeid);
    }
    @Override
    public List<Movie> getMovies() {
        return movieMapper.selectMovies();
    }

    @Override
    public Movie getMovie(String movieid) {
        return movieMapper.selectMovie(movieid);
    }

    @Override
    public List<Showmovie> getShowmovies(int showid) {

        return showmovieMapper.selectShowmovies(showid);
    }
    @Override
    public List<Showmovie> findShowmovies(String movieid) {

        return showmovieMapper.findShowmovies(movieid);
    }
    @Override
    public List<Showhall> getShowhalls() {
        return showhallMapper.selectShowhalls();
    }
    @Override
    public  Showhall  getShowhall(int showid) {
        return showhallMapper.selectShowhall(showid);
    }
}
