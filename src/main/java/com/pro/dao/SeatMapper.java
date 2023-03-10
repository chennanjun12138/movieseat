package com.pro.dao;

import com.pro.domain.Seat;

import java.util.List;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//标识当前接口已加入容器
public interface SeatMapper {
    List<Seat>selectSeats(int showid,String movieid);
    Seat selectSeat(int seatid);
    void  update(int seatid,int seatstatus);
    void add(Seat seat);
    Seat selectId(int showid,String movieid,int rownumber,int seatnumber);
    void update2(int showid,String movieid,int rownumber,int seatnumber,int seatstatus);
}
