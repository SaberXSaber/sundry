package com.gsb.sundry.controller;

import com.gsb.sundry.pojo.*;
import com.gsb.sundry.service.FundService;
import com.gsb.sundry.service.SharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("/shares")
public class SharesController {

    @Autowired
    private SharesService shareserviceImpl;


    @RequestMapping("/list")
    public ResultBeanPage getList(@RequestBody SharesVO sharesVO) {
        List<SharesDO> f = shareserviceImpl.getlist(sharesVO);
        int total = shareserviceImpl.getTotalCount(sharesVO);
        return new ResultBeanPage<FundDO>(f,total);
    }
    @RequestMapping("/sharesAnalysisdatalist")
    public ResultBeanPage<List<SharesDO>> sharesAnalysisdatalist(@RequestBody SharesVO sharesVO)  {
        List<SharesAnalysisVO> listPages =shareserviceImpl.getsharesAnalysisList(sharesVO);
        int recordTotal = shareserviceImpl.getsharesAnalysisTotal(sharesVO);
        return new ResultBeanPage<List<SharesDO>>(listPages,recordTotal);

    }

}
