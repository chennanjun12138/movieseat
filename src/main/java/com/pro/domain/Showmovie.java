package com.pro.domain;

public class Showmovie {

    private String movieid;
    private  int showid;
    private  int timeid;

    public Showmovie(String movieid, int showid, int timeid) {
        this.movieid = movieid;
        this.showid = showid;
        this.timeid = timeid;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public int getShowid() {
        return showid;
    }

    public void setShowid(int showid) {
        this.showid = showid;
    }

    public int getTimeid() {
        return timeid;
    }

    public void setTimeid(int timeid) {
        this.timeid = timeid;
    }
}
