package com.robin.demo.dao;

/**
 * Created by Administrator on 2016/3/10.
 */

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Administrator on 2015/10/26.
 */
@Component
public class DemoUserDao extends BaseDao{

    public Map getUserByMobile(String mobile) {
        try {
            return getJdbcTemplate().queryForMap("SELECT * FROM common_user WHERE mobile=?", new Object[]{mobile});
        } catch (EmptyResultDataAccessException exception) {
            return null;
        }

    }
}
