package com.pro.domain;

public class Seat {
    private  int  seatid;
    private  int  showid;
    private String movieid ;
    private  int  timeid;
    private  int ticketid ;
    private  int  rownumber;
    private  int  seatnumber;
    private  int  seatstatus;
    private  int ticketvalue;
    public Seat(){}

    public Seat(int seatid, int showid, String movieid, int timeid, int ticketid, int rownumber, int seatnumber, int seatstatus, int ticketvalue) {
        this.seatid = seatid;
        this.showid = showid;
        this.movieid = movieid;
        this.timeid = timeid;
        this.ticketid = ticketid;
        this.rownumber = rownumber;
        this.seatnumber = seatnumber;
        this.seatstatus = seatstatus;
        this.ticketvalue = ticketvalue;
    }
    public Seat( int showid, String movieid, int timeid, int ticketid, int rownumber, int seatnumber, int seatstatus, int ticketvalue) {

        this.showid = showid;
        this.movieid = movieid;
        this.timeid = timeid;
        this.ticketid = ticketid;
        this.rownumber = rownumber;
        this.seatnumber = seatnumber;
        this.seatstatus = seatstatus;
        this.ticketvalue = ticketvalue;
    }
    public int getSeatid() {
        return seatid;
    }

    public void setSeatid(int seatid) {
        this.seatid = seatid;
    }

    public int getShowid() {
        return showid;
    }

    public void setShowid(int showid) {
        this.showid = showid;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public int getTimeid() {
        return timeid;
    }

    public void setTimeid(int timeid) {
        this.timeid = timeid;
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getRownumber() {
        return rownumber;
    }

    public void setRownumber(int rownumber) {
        this.rownumber = rownumber;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public int getSeatstatus() {
        return seatstatus;
    }

    public void setSeatstatus(int seatstatus) {
        this.seatstatus = seatstatus;
    }

    public int getTicketvalue() {
        return ticketvalue;
    }

    public void setTicketvalue(int ticketvalue) {
        this.ticketvalue = ticketvalue;
    }
}
