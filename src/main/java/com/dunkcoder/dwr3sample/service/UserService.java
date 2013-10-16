package com.dunkcoder.dwr3sample.service;

import com.dunkcoder.dwr3sample.model.User;

public class UserService {

    public UserService() {
    }

    public User getUser() throws Exception {
        User user = new User();
        user.setId(1);
        user.setUsername("s3dwr3.sample");
        user.setEmail("s3dwr3.sample@dunkcoder");
        return user;
    }
}