package com.pro.domain;

public class Movie {

    private String movieid;
    private  String moviename;
    private  String moviesource;
    private  int movietime;

    public Movie(){}

    public Movie(String movieid, String moviename, String moviesource, int movietime) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.moviesource = moviesource;
        this.movietime = movietime;
    }
    public Movie(  String moviename, String moviesource, int movietime) {

        this.moviename = moviename;
        this.moviesource = moviesource;
        this.movietime = movietime;
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
}
