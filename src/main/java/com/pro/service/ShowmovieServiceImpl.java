package com.pro.service;

import com.pro.dao.MovieMapper;
import com.pro.dao.ShowmovieMapper;
import com.pro.domain.Showmovie;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowmovieServiceImpl implements ShowmovieService {
    @Autowired
    private ShowmovieMapper showmovieMapper;

    @Override
    public List<Showmovie> getShowmovies(int showid) {

        return showmovieMapper.selectShowmovies(showid);
    }
}
