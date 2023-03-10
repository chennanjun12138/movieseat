package com.pro.controller;

import com.pro.domain.*;
import com.pro.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowmovieController {
    @Autowired
    private SeatService seatService;
    @GetMapping("/toseat")
    public String toseat(int showid,String movieid, Model model)
    {
        List<Seat>seatList=seatService.getSeats(showid,movieid);
        Movie m1=seatService.getMovie(movieid);
        model.addAttribute("mseatshowid",showid);
        model.addAttribute("seatList",seatList);
        int  value=0;
        String playtime="";
        List<Showmovie> showmovieList=seatService.findShowmovies(m1.getMovieid());
        for ( Showmovie showmovie:showmovieList  )
        {
            Time t1=seatService.getTime(showmovie.getTimeid());
            playtime=t1.getShowtime();
        }
        List<String>seatList1=new ArrayList<>();
        List<String>seatList2=new ArrayList<>();
        for (Seat s1:seatList)
        {
            value=s1.getTicketvalue();
            if (s1.getSeatstatus()==1)
            {
                seatList1.add(s1.getRownumber()+"_"+s1.getSeatnumber());
            }
            if (s1.getSeatstatus()==2) {
                seatList2.add(s1.getRownumber()+"_"+s1.getSeatnumber());
            }
        }

        model.addAttribute("value",value);
        model.addAttribute("movie",m1);
        model.addAttribute("time",playtime);
        model.addAttribute("seat1",seatList1);
        model.addAttribute("seat2",seatList2);

        return "seat";
    }
    @RequestMapping("/order")
   public  String order(int showid,String movieid,int rownumber,int seatnumber,int seatstatus,Model model)

    {
        seatService.modify2(showid, movieid, rownumber, seatnumber,seatstatus);
        System.out.println(showid+"  "+movieid+" "+rownumber+" "+seatnumber);

       // Seat sm=seatService.findSeat(1,"001",1,1);

      //  seatService.modify(seatid,seatstatus);



        List<String>seatList1=new ArrayList<>();
        List<String>seatList2=new ArrayList<>();
       // String movieid=seat.getMovieid();
       // int showid=seat.getShowid();
        Movie m1=seatService.getMovie(movieid);
        List<Seat>seatList=seatService.getSeats(showid,movieid);
        model.addAttribute("mseatshowid",showid);
        model.addAttribute("seatList",seatList);
        int  value=0;
        String playtime="";
        List<Showmovie> showmovieList=seatService.findShowmovies(m1.getMovieid());
        for ( Showmovie showmovie:showmovieList  )
        {
            Time t1=seatService.getTime(showmovie.getTimeid());
            playtime=t1.getShowtime();

        }
        for (Seat s1:seatList)
        {
            value=s1.getTicketvalue();
            if (s1.getSeatstatus()==1)
            {
               seatList1.add(s1.getRownumber()+"_"+s1.getSeatnumber());
            }
            if (s1.getSeatstatus()==2)
            {
               seatList2.add(s1.getRownumber()+"_"+s1.getSeatnumber());
            }
        }
        model.addAttribute("value",value);
        model.addAttribute("movie",m1);
        model.addAttribute("time",playtime);
        model.addAttribute("seat1",seatList1);
        model.addAttribute("seat2",seatList2);
        System.out.println(seatList1);
        System.out.println(seatList2);
        return  "seat";
    }
    @GetMapping("/tomodify")
    public  String tomodify(int showid,String movieid,int rownumber,int seatnumber,Model model)
    {
        Seat s1=seatService.findSeat(showid, movieid, rownumber, seatnumber);
        int seatid=s1.getSeatid();
        Seat seat=seatService.getSeat(seatid);
        model.addAttribute("seat",seat);
        return   "modify";
    }


}
