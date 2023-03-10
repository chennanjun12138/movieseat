package com.pro.domain;

public class TimeMovie {
    private String movieid;
    private  String moviename;
    private  String moviesource;
    private  int movietime;
    private int timeid;
    private String showtime;

    public TimeMovie(String movieid, String moviename, String moviesource, int movietime, int timeid, String showtime) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.moviesource = moviesource;
        this.movietime = movietime;
        this.timeid = timeid;
        this.showtime = showtime;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviesource() {
        return moviesource;
    }

    public void setMoviesource(String moviesource) {
        this.moviesource = moviesource;
    }

    public int getMovietime() {
        return movietime;
    }

    public void setMovietime(int movietime) {
        this.movietime = movietime;
    }

    public int getTimeid() {
        return timeid;
    }

    public void setTimeid(int timeid) {
        this.timeid = timeid;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }
}
