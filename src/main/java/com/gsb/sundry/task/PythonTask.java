package com.gsb.sundry.task;

import com.gsb.sundry.utils.ParamUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author gsb
 * @version V1.0.0
 * @date 2019-01-03
 * @time 10:25
 * @description
 */
@Component
public class PythonTask {
    //0 0 12 ? * WED 表示每个星期三中午12点
    @Scheduled(cron = "0/30 * * * * *")
    public void scheduled(){


        System.out.println("run task ---->"+System.currentTimeMillis());
//        String cmd ="cmd /c D: && cd D:\\devTest\\spider_douban && scrapy crawl douban250 -o resultinfo.csv -t csv";
//        String cmd ="ping ww.baidu.com";
//        ParamUtils.exe(cmd);
    }
}
