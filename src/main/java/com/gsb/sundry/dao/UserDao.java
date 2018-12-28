package com.gsb.sundry.dao;

import com.gsb.sundry.pojo.User;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-12-24
 * @time 16:25
 * @description
 */
public interface UserDao {
    User getUserByNameAndPwd(User user);
}
