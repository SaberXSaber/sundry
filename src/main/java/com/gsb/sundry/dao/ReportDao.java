package com.gsb.sundry.dao;

import com.gsb.sundry.pojo.RepoertVO;

import java.util.List;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2018-08-10
 * @time 14:30
 * @description
 */
public interface ReportDao {
    List<String> getDateList(RepoertVO repoertVO);
    List<Integer> getDataList(String sharescode);
}
