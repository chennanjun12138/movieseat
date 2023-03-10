package com.pro.dao;
import com.pro.domain.Showhall;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//标识当前接口已加入容器
public interface ShowhallMapper {
    List<Showhall>selectShowhalls();
    Showhall selectShowhall(int showid);
}
