package com.gsb.sundry.controller;

import com.gsb.sundry.pojo.ResultBean;
import com.gsb.sundry.pojo.User;
import com.gsb.sundry.service.UserService;
import com.gsb.sundry.utils.ParamUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-12-21
 * @time 15:56
 * @description
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/")
    public String getList() {
        return "hello word";
    }

    @RequestMapping("/login")
    public ResultBean login(@RequestBody User user,HttpSession httpSession){
        if(StringUtils.isBlank(user.getLoginName())||StringUtils.isBlank(user.getPassword())){
            return new ResultBean<Integer>(ResultBean.FAIL,"登录名或密码不能为空");
        }
       /* String code = (String) httpSession.getAttribute("checkCode");
        if (!user.getVertCode().equalsIgnoreCase(code)) {
            return new ResultBean<Integer>(ResultBean.FAIL,"输入验证码错误");
        }*/
        User us = userServiceImpl.getUserByNameAndPwd(user);
        if(null != us){
            httpSession.setAttribute(ParamUtils.SEESION_USER,user);
            httpSession.setMaxInactiveInterval(ParamUtils.SEESION_TIME);
            return new ResultBean<Integer>(us.getId(),ResultBean.SUCCESS,"登录成功");
        }else {
            return new ResultBean<Integer>(ResultBean.FAIL,"登录失败,登录名或密码错误");
        }

    }

    @RequestMapping(value = "/logout")
    @ResponseBody
    public ResultBean<Integer> logout( HttpSession httpSession) {
        httpSession.removeAttribute(ParamUtils.SEESION_USER);
        return new ResultBean<Integer>(ResultBean.SUCCESS,"退出成功");
    }


    /**
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/getUser")
    @ResponseBody
    public ResultBean<String> getOperator( HttpSession httpSession) {
        User user = (User)httpSession.getAttribute(ParamUtils.SEESION_USER);
        if (user != null) {
            return new ResultBean<String>(user.getName());
        } else {
            return new ResultBean<String>(401,"登陆过期,请重新登录");
        }
    }

}
