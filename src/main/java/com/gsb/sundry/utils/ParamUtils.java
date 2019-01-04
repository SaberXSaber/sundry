package com.gsb.sundry.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/11/22
 * Time: 19:50
 * Description：
 */
public class ParamUtils {


    public static String SEESION_USER = "user";
    public static Integer SEESION_TIME = 300*60;


    public static Integer OperatorType_DELETE = 0;
    public static Integer OperatorType_ADD = 1;
    public static Integer OperatorType_EDIT = 2;
    public static Integer OperatorType_LOCK = 3;
    public static Integer OperatorType_IMPORT = 4;
    public static Integer OperatorType_UNLOCK = 5;
    public static Integer OperatorType_GETRIGHT = 6;


    /**
     * 设置下载文件中文件的名称
     *
     * @param fileName
     * @param request
     * @return
     */
    public static String encodeFilename(String fileName, HttpServletRequest request) {
        /**
         * 获取客户端浏览器和操作系统信息
         * 在IE浏览器中得到的是：User-Agent=Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; Maxthon; Alexa Toolbar)
         * 在Firefox中得到的是：User-Agent=Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.7.10) Gecko/20050717 Firefox/1.0.6
         */
        /*String agent = request.getHeader("USER-AGENT");
        try {
            if ((agent != null) && (-1 != agent.indexOf("MSIE"))) {
                String newFileName = URLEncoder.encode(fileName, "UTF-8");
                newFileName = StringUtils.replace(newFileName, "+", "%20");
                if (newFileName.length() > 150) {
                    newFileName = new String(fileName.getBytes("GB2312"), "ISO8859-1");
                    newFileName = StringUtils.replace(newFileName, " ", "%20");
                }
                return newFileName;
            }
            if ((agent != null) && (-1 != agent.indexOf("Mozilla")))
                return MimeUtility.encodeText(fileName, "UTF-8", "B");

            return fileName;
        } catch (Exception ex) {
            return fileName;
        }*/
        String userAgent = request.getHeader("USER-AGENT");
        try {
            String finalFileName = null;
            if (StringUtils.contains(userAgent, "MSIE")) {//IE浏览器
                finalFileName = URLEncoder.encode(fileName, "UTF8");
            } else if (StringUtils.contains(userAgent, "Mozilla")) {//google,火狐浏览器
                finalFileName = new String(fileName.getBytes(), "ISO8859-1");
            } else {
                finalFileName = URLEncoder.encode(fileName, "UTF8");//其他浏览器
            }
            return finalFileName;
        } catch (UnsupportedEncodingException e) {
            return fileName;
        }
    }

    public static Object getNullValue(Object o) {
        return o != null ? o : "";
    }




    public static void exe(String cmd){
        Runtime run = Runtime.getRuntime();//返回与当前 Java 应用程序相关的运行时对象
        try {
           /* Process p = run.exec(cmd.split(" "));// 启动另一个进程来执行命令
            BufferedInputStream in = new BufferedInputStream(p.getInputStream());
            BufferedReader inBr = new BufferedReader(new InputStreamReader(in));
            String lineStr;
            while ((lineStr = inBr.readLine()) != null){
                //获得命令执行后在控制台的输出信息
                System.out.println(lineStr);// 打印输出信息
            }

            //检查命令是否执行失败。
            if (p.waitFor() != 0) {
                if (p.exitValue() == 1){
                    //p.exitValue()==0表示正常结束，1：非正常结束
                    System.err.println("命令执行失败!");
                }
            }
            inBr.close();
            in.close();*/
            run.exec(cmd.split(" "));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void exe(String filepath, List<String> list){
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe");
            builder.directory(new File(filepath));
            Process process = builder.command(list).start();
            /*InputStream inputStream = process.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"gb2312"));
            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    public static void main(String[] args) throws ParseException {
//        String cmd ="cmd /c D: && cd D:\\devTest\\spider_douban && scrapy crawl douban250 -o resultinfo.csv -t csv";
        String cmd ="ping www.baidu.com";
        exe(cmd);




       /* List<String> list =new ArrayList<>();
        list.add("scrapy");
        list.add("crawl");
        list.add("douban250");
        exe("D:\\devTest\\spider_douban\\",list);*/
    }
}
