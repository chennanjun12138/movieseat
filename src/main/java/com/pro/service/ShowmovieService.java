package com.pro.service;

import com.pro.domain.Showmovie;

import java.util.List;

public interface ShowmovieService {
    List<Showmovie> getShowmovies(int showid);
}
