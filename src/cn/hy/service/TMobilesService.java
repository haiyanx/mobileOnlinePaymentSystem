package cn.hy.service;

import cn.hy.pojo.TMobiles;

import java.util.List;

public interface TMobilesService {

    int addResources(String mobileType, long from, long to);
    TMobiles findMobileNumberByNumber(String mobileNum);

    int addTxtResources(List<String> olist);
}
