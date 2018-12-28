package com.gsb.sundry.dao;


import com.gsb.sundry.pojo.FundDO;
import com.gsb.sundry.pojo.FundVO;
import com.gsb.sundry.pojo.SharesDO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/8/1
 * Time: 9:30
 * Description
 */
public interface FundDao {
    FundDO getFundById(Integer fundId);

    List<SharesDO> getSharesByFundId(Integer fundId);

    List<String> getSharesCodeByFundId(int id);

    List getlist(FundVO fundVO);

    int getTotalCount(FundVO fundVO);
}
