package com.gsb.sundry.service;

import com.gsb.sundry.pojo.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/8/1
 * Time: 9:30
 * Description
 */
public interface FundService {


    FundDO getFundById(Integer fundId);

    List<SharesDO> getSharesByFundId(Integer fundId);


    List getlist(FundVO fundVO);

    int getTotalCount(FundVO fundVO);
}
