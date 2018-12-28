package com.gsb.sundry.dao;

import com.gsb.sundry.pojo.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/8/1
 * Time: 9:30
 * Description
 */
public interface SharesDao {



    List<FundDO> getFundBysharesCode(String sharesCode);
    int getFundBysharesCodeTotal(String sharesCode);
    List<String> getTime();

    List<SharesDO> getlist(SharesVO sharesVO);

    int getTotalCount(SharesVO sharesVO);

    List<SharesAnalysisVO> getsharesAnalysisList(SharesVO sharesVO);

    int getsharesAnalysisTotal(SharesVO sharesVO);
}
