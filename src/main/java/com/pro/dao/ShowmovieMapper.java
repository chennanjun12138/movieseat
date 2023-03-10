package com.pro.dao;
import com.pro.domain.Showmovie;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//标识当前接口已加入容器
public interface ShowmovieMapper {
    List<Showmovie>selectShowmovies(int showid);
    List<Showmovie>findShowmovies(String movieid);
}
