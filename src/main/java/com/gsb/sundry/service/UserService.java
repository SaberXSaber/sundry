package com.gsb.sundry.service;

import com.gsb.sundry.pojo.User;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-12-24
 * @time 16:03
 * @description
 */
public interface UserService {
    User getUserByNameAndPwd(User user);
}
