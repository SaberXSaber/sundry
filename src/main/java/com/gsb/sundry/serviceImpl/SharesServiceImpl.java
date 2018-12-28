package com.gsb.sundry.serviceImpl;

import com.gsb.sundry.dao.SharesDao;
import com.gsb.sundry.pojo.*;
import com.gsb.sundry.service.SharesService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/8/1
 * Time: 10:38
 * Description
 */
@Service
public class SharesServiceImpl implements SharesService {
    @Resource
    private SharesDao sharesDao;


    @Override
    public List<FundDO> getFundBysharesCode(String sharesCode) {
        return sharesDao.getFundBysharesCode(sharesCode);
    }

    @Override
    public int getFundBysharesCodeTotal(String sharesCode) {
        return sharesDao.getFundBysharesCodeTotal(sharesCode);
    }





    @Override
    public List<String> getTime() {
        return  sharesDao.getTime();
    }

    @Override
    public List<SharesDO> getlist(SharesVO sharesVO) {
        return sharesDao.getlist(sharesVO);
    }

    @Override
    public int getTotalCount(SharesVO sharesVO) {
        return sharesDao.getTotalCount(sharesVO);
    }

    @Override
    public List<SharesAnalysisVO> getsharesAnalysisList(SharesVO sharesVO) {
        return sharesDao.getsharesAnalysisList(sharesVO);
    }

    @Override
    public int getsharesAnalysisTotal(SharesVO sharesVO) {
        return sharesDao.getsharesAnalysisTotal(sharesVO);
    }


}
