package com.gsb.sundry.serviceImpl;

import com.gsb.sundry.dao.UserDao;
import com.gsb.sundry.pojo.User;
import com.gsb.sundry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-12-24
 * @time 16:24
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByNameAndPwd(User user) {
        return userDao.getUserByNameAndPwd(user);
    }
}
