package com.his.controller;

import com.his.pojo.SysMenu;
import com.his.service.SystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/sy")
public class SysMenuController {

    @Autowired
    SystemMenuService systemMenuService;

    @RequestMapping("/login")
    public String list(String userName,String userPassword){
        return systemMenuService.login(userName,userPassword);
    }

}
