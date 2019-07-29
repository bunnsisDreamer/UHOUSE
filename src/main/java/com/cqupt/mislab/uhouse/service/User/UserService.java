package com.cqupt.mislab.uhouse.service.User;

import com.cqupt.mislab.uhouse.model.user.User;

public interface UserService {

    boolean updateUser(User user);

    User login(User user);
}
