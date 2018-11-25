package cn.hy.service;

import cn.hy.pojo.TMobiles;

public interface TMobilesService {

    int addResources(String mobileType, long from, long to);
    TMobiles findMobileNumberByNumber(String mobileNum);
}
