package com.pro.controller;

import com.pro.domain.*;
import com.pro.service.MovieService;
import com.pro.service.ShowhallService;
import com.pro.service.ShowmovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowhallController {
    @Autowired
    private ShowhallService showhallService;
    @GetMapping("/showhall")
    @ResponseBody
    public Object showhall(int showid)
    {
        Showhall showhall= showhallService.getShowhall(showid);
        return showhall;
    }

    @GetMapping("/showhalls")
    public String showhalls(Model model){
        List<Showhall> showhallList= showhallService.getShowhalls();
        model.addAttribute("showhallList",showhallList);
        return "showhalls";
    }
    @GetMapping("/toshowhalls")
    public String toshowhalls(){

        return "redirect:showhalls";
    }
    @GetMapping("/tomovie")
    public String tomovie(Model model){
        List<Movie>movieList=showhallService.getMovies();;
        List<TimeMovie>timeMovieList=new  ArrayList<>();

        for(Movie m1:movieList)
        {
            List<Showmovie> showmovieList=showhallService.findShowmovies(m1.getMovieid());
            for ( Showmovie showmovie:showmovieList  )
            {
                Time t1=showhallService.getTime(showmovie.getTimeid());
                TimeMovie tm=new TimeMovie(m1.getMovieid(),m1.getMoviename(),m1.getMoviesource(),m1.getMovietime(),t1.getTimeid(),t1.getShowtime());
                timeMovieList.add(tm);
            }

        }
        model.addAttribute("timeMovieList",timeMovieList);
        return "movie";
    }
    @GetMapping("/toshowmovie")
    public String toshowmovie(int showid,Model model){
         List<Showmovie> showmovieList=showhallService.getShowmovies(showid);
         List<Movie>movieList=new ArrayList<>();;
         List<Time>timeList=new  ArrayList<>();
         List<TimeMovie>timeMovieList=new  ArrayList<>();
         for (Showmovie showmovie:showmovieList )
         {

             movieList.add(showhallService.getMovie(showmovie.getMovieid()));
             timeList.add(showhallService.getTime(showmovie.getTimeid()));
             Movie m1=showhallService.getMovie(showmovie.getMovieid());
             Time t1=showhallService.getTime(showmovie.getTimeid());
             TimeMovie tm=new TimeMovie(m1.getMovieid(),m1.getMoviename(),m1.getMoviesource(),m1.getMovietime(),t1.getTimeid(),t1.getShowtime());
             timeMovieList.add(tm);
         }
         model.addAttribute("timeMovieList",timeMovieList);
        model.addAttribute("showid",showid);
        return  "showmovie";
    }

}
