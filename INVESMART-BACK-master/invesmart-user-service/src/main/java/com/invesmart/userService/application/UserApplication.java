package com.invesmart.userService.application;

import com.invesmart.invesmartModel.model.user.User;
import com.invesmart.userService.exception.UserServiceException;

public interface UserApplication {

    User login(String username, String password, String ip) throws UserServiceException;

}
