package com.jasongofen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 自定义转换工具类
 * @Project: SolrProject
 * @Author: JasonGofen
 * @Date: 2019/3/28
 * @UpdatedBy:
 * @UpdateDate:
 */
public class ConvertUtil {

    /**
     * 获取文件后缀名
     * @param fileName
     * @return
     */
    public static String getFileSufix(String fileName) {
        int splitIndex = fileName.lastIndexOf(".");
        return fileName.substring(splitIndex + 1).toLowerCase();
    }

    /**
     * 获取当前日期字符串
     * @return
     */
    public static String formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String nTime = sdf.format(now);
        return nTime;
    }

    /**
     * 获取传入日期字符串
     * @param dat
     * @return
     */
    public static String formatDate(Date dat){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        //Date now = new Date();
        String nTime = sdf.format(dat);
        return nTime;
    }

}
