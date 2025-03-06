package com.mangosteen.app.controller;

import com.mangosteen.app.mapper.UserInfoMapper;
import com.mangosteen.app.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserInfoMapper userInfoMapper;

    // 将UserInfoMapper进行构造器注入
    @Autowired
    public UserController(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @GetMapping(path = "v1.0/users/{id}")
    UserInfo getUserInfoById(@PathVariable Long id) {
        return userInfoMapper.getUserInfoByUserId(id);
    }
}
