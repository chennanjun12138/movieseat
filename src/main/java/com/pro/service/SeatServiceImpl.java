package com.pro.service;

import com.pro.dao.MovieMapper;
import com.pro.dao.SeatMapper;
import com.pro.dao.ShowmovieMapper;
import com.pro.dao.TimeMapper;
import com.pro.domain.Movie;
import com.pro.domain.Seat;

import java.util.List;
import java.util.List;

import com.pro.domain.Showmovie;
import com.pro.domain.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    private SeatMapper seatMapper;
    @Autowired
    public MovieMapper movieMapper;
    @Autowired
    private ShowmovieMapper showmovieMapper;
    @Autowired
    private TimeMapper timeMapper;
    @Override
    public List<Seat> getSeats(int showid,String movieid) {
        return seatMapper.selectSeats(showid,movieid);
    }
    @Override
    public   Seat getSeat(int seatid) {
        return seatMapper.selectSeat(seatid);
    }
    @Override
    public   Seat findSeat(int showid,String movieid,int rownumber,int seatnumber) {
        return seatMapper.selectId(showid,movieid,rownumber,seatnumber);
    }
    @Override
    public void modify(int seatid,int seatstatus) {
        seatMapper.update(seatid,seatstatus);
    }
    @Override
    public void modify2(int showid,String movieid,int rownumber,int seatnumber,int seatstatus) {
        seatMapper.update2( showid,  movieid,  rownumber,  seatnumber,  seatstatus);
    }
    @Override
    public void insert(Seat seat) {
        seatMapper.add(seat);
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
    public List<Showmovie> findShowmovies(String movieid) {

        return showmovieMapper.findShowmovies(movieid);
    }
    @Override
    public Time getTime(int timeid)
    {
        return timeMapper.selectTime(timeid);
    }
}
