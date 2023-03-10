package com.pro.service;

import com.pro.domain.Movie;
import com.pro.domain.Seat;
import com.pro.domain.Showmovie;
import com.pro.domain.Time;

import java.util.List;

public interface SeatService {
    List<Seat>getSeats(int showid,String movieid);
    void modify(int seatid,int seatstatus );
    Seat getSeat(int seatid);
   void insert(Seat seat);
    List<Movie>getMovies();
    Movie getMovie(String movieid);
    List<Showmovie> findShowmovies(String movieid);
    Time getTime(int timeid);
    Seat findSeat(int showid,String movieid,int rownumber,int seatnumber);
    void  modify2(int showid,String movieid,int rownumber,int seatnumber,int seatstatus);
}
