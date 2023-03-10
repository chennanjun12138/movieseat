package com.pro.domain;

public class Time {
    private int timeid;
    private String showtime;

    public Time(int timeid, String showtime) {
        this.timeid = timeid;
        this.showtime = showtime;
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
