package com.gsb.sundry.controller;

import com.gsb.sundry.pojo.FundDO;
import com.gsb.sundry.pojo.FundVO;
import com.gsb.sundry.pojo.ResultBeanPage;
import com.gsb.sundry.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-11-15
 * @time 11:40
 * @description
 */
@RestController
@RequestMapping("/fund")
public class FundController {

    @Autowired
    private FundService fundServiceImpl;


    @RequestMapping("/list")
    public ResultBeanPage getList(@RequestBody FundVO fundVO) {
        List<FundDO> f = fundServiceImpl.getlist(fundVO);
        int total = fundServiceImpl.getTotalCount(fundVO);
        return new ResultBeanPage<FundDO>(f,total);
    }

    @RequestMapping("/get")
    public FundDO get(Integer fundId) {
        FundDO f = fundServiceImpl.getFundById(fundId);
        return f;
    }
}
