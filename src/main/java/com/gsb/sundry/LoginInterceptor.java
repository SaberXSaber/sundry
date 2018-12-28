package com.gsb.sundry;

import com.alibaba.fastjson.JSONObject;
import com.gsb.sundry.pojo.ResultBean;
import com.gsb.sundry.pojo.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-12-24
 * @time 10:06
 * @description
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {


    //这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String errorResult = JSONObject.toJSONString(new ResultBean(401,"登录过期,请重新登录!"));
        //每一个项目对于登陆的实现逻辑都有所区别，我这里使用最简单的Session提取User来验证登陆。
       /* HttpSession session = request.getSession();
        //这里的User是登陆时放入session的
        User user = (User) session.getAttribute("user");
        //如果session中没有user，表示没登陆*/
        String Authorization =request.getHeader("Authorization");
        if (StringUtils.isBlank(Authorization)){
            //这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
            //当然你可以利用response给用户返回一些提示信息，告诉他没登陆
          /*  PrintWriter out = response.getWriter();
            out.append(errorResult);*/

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", "401");
            jsonObject.put("msg", "登陆过期,请重新登录");
            response.setCharacterEncoding("utf-8");
            response.addHeader("Content-Type", "application/json");
            response.getWriter().print(jsonObject.toString());

            return false;
        }else {
            return true;    //如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }


}
