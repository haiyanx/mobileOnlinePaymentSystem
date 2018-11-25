package cn.hy.service.impl;

import cn.hy.mapper.TMobilesMapper;
import cn.hy.pojo.TMobiles;
import cn.hy.pojo.TOperator;
import cn.hy.service.TMobilesService;
import cn.hy.utiles.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TMobilesServiceImpl implements TMobilesService {
    @Autowired
    private TMobilesMapper tMobilesMapper;

    @Override
    public int addResources(String mobileType, long from, long to) {
        List<TMobiles> tMobileslist = new ArrayList<>();
        long count = to - from+1;
        int cc = 0;
        for(int i = 0; i<count;i++) {
            TMobiles tMobiles = new TMobiles();
            tMobiles.setMobileType(mobileType);
            tMobiles.setCardNumber(CommonUtils.uuid().substring(0,13));
            tMobiles.setMobileNumber(from+i+"");
            tMobiles.setIsAvailable("y");
            tMobileslist.add(tMobiles);
        }
        for(int j=0;j<tMobileslist.size();j++) {
            String mobileNum = tMobileslist.get(j).getMobileNumber();
            TMobiles findTM = findMobileNumberByNumber(mobileNum);
            if(findTM == null) {
                tMobilesMapper.insert(tMobileslist.get(j));
                cc++;
            }else {
                continue;
            }
        }

        return cc;
    }
    @Override
    public TMobiles findMobileNumberByNumber(String mobileNum) {
        return tMobilesMapper.selectByPrimaryKey(mobileNum);
    }
}
