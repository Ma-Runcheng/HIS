package com.his.mapper;

import com.his.pojo.SysMenu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysMenuMapper {
    @Select("SELECT url from sys_menu m where " +
            "parent_id = (SELECT role_parent_id from sys_role where role_name=#{userName} and role_password = #{password})")
    String getLoginURL(String userName,String password);
}
