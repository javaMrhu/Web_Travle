package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImgeDao;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RouteImgeDaoImpl implements RouteImgeDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<RouteImg> findImg(int id) {
        String sql = "select * from tab_route_img where rid=?";
        List<RouteImg> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(RouteImg.class), id);
        return list;
    }
}
