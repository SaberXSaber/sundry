package com.gsb.sundry.controller;


import com.gsb.sundry.pojo.RepoertVO;
import com.gsb.sundry.pojo.ResultBean;
import com.gsb.sundry.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-08-10
 * @time 14:19
 * @description
 */
@RequestMapping("/report")
@RestController
public class ReportController {
    @Autowired
    private ReportService reportServiceImpl;

    @RequestMapping("/list")
    public ResultBean<RepoertVO> getListByPage(@RequestBody RepoertVO repoertVO,HttpSession httpSession){
        SimpleDateFormat smdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();

        try {
            repoertVO = reportServiceImpl.getReport(repoertVO);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean<RepoertVO>(repoertVO, ResultBean.FAIL,"查询异常");
        }
        return new ResultBean<RepoertVO>(repoertVO);
    }

}
