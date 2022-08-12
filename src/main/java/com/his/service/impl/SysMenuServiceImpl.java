package com.his.service.impl;

import com.his.pojo.SysMenu;
import com.his.mapper.SysMenuMapper;
import com.his.service.SystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SystemMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;

    @Override
    public String login(String userName, String password) {
        String url = sysMenuMapper.getLoginURL(userName,password);
        if(url == null){
            return "0";
        }else{
            return url;
        }
    }
}
