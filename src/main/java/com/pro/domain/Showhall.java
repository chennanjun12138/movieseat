package com.pro.domain;

public class Showhall {
    private  int showid;
    private String showname;
    private  int seatnum;
    private  int grade;
    public Showhall(){}
    public Showhall(int showid, String showname, int seatnum, int grade) {
        this.showid = showid;
        this.showname = showname;
        this.seatnum = seatnum;
        this.grade = grade;
    }
    public Showhall( String showname, int seatnum, int grade) {

        this.showname = showname;
        this.seatnum = seatnum;
        this.grade = grade;
    }
    public int getShowid() {
        return showid;
    }

    public void setShowid(int showid) {
        this.showid = showid;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname;
    }

    public int getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(int seatnum) {
        this.seatnum = seatnum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
