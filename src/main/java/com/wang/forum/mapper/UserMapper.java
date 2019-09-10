package com.wang.forum.mapper;

import com.wang.forum.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author wangyt
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified) values" +
            " (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified});")
    void insert(User user);
}
