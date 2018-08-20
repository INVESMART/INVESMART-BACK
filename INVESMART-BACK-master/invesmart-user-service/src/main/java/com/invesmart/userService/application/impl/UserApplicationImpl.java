package com.invesmart.userService.application.impl;

import com.invesmart.invesmartModel.model.user.User;
import com.invesmart.userService.application.UserApplication;
import com.invesmart.userService.exception.UserServiceException;

public class UserApplicationImpl implements UserApplication {
    @Override
    public User login(String username, String password, String ip) throws UserServiceException {
        return null;
    }
}
