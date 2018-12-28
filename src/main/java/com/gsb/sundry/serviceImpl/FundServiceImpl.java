package com.gsb.sundry.serviceImpl;

import com.gsb.sundry.dao.FundDao;
import com.gsb.sundry.dao.SharesDao;
import com.gsb.sundry.pojo.*;
import com.gsb.sundry.service.FundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/8/1
 * Time: 10:39
 * Description
 */
@Service
public class FundServiceImpl implements FundService {
//    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(FundServiceImpl.class);

    @Resource
    private FundDao fundDao;

    @Resource
    private SharesDao sharesDao;



    @Override
    public FundDO getFundById(Integer fundId) {
        return fundDao.getFundById(fundId);
    }

    @Override
    public List<SharesDO> getSharesByFundId(Integer fundId) {
        return fundDao.getSharesByFundId(fundId);
    }

    @Override
    public List getlist(FundVO fundVO) {
        return fundDao.getlist(fundVO);
    }

    @Override
    public int getTotalCount(FundVO fundVO) {
        return fundDao.getTotalCount(fundVO);
    }


}
